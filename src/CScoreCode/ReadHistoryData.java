package CScoreCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadHistoryData {
  public static MyCustomClass ReadData(String _format) throws IOException{
	  if(Calculate_All_Dryer_info.visited >0) return Calculate_All_Dryer_info.Agentinput;
		  
	  _format =_format.replaceAll("\\W_", " ");
      _format =_format.replaceAll("NDCS", "");
	  _format =_format.replaceAll("DCS", "");
	  //Parse the words in the input string
	  Pattern pattern = Pattern.compile("\\w+");
	  Matcher matcher = pattern.matcher(_format);
	  int Goodcount =0;
	  //read all the candidates
	  List<String> temp = new ArrayList<String>();
	  while (matcher.find()) {
		  if(matcher.group().toUpperCase().length()<=4)
		  temp.add(matcher.group().toUpperCase());
		  else temp.add(matcher.group().toUpperCase().substring(0, 4));
		}
	  
	  if( temp.isEmpty()) return null;
	  
	  
	  
	  MyCustomClass container = new MyCustomClass();
	  //..
	  FileInputStream file;
	try {
		//file = new FileInputStream(new File("/dryerjobcoder/jobcode.xls"));
		//Get file from resources folder
		file = new FileInputStream("jobcode.xls");
		
		  //Get the workbook instance for XLS file 
		  HSSFWorkbook workbook = new HSSFWorkbook(file);
		   
		  //Get first sheet from the workbook
		  HSSFSheet sheet = workbook.getSheetAt(1);
		   
		  //Get iterator to all the rows in current sheet
		  Iterator<Row> rowIterator = sheet.iterator();
		   
		  //Get iterator to all cells of current row
		  
		  Row row = rowIterator.next();
          
          //For each row, iterate through each columns
          Iterator<Cell> cellIterator = row.cellIterator();
          cellIterator.next(); 
          while(cellIterator.hasNext() ) {
          Cell cell = cellIterator.next(); 
          if (cell.getStringCellValue() == null || cell.getStringCellValue() =="null") break;
          container.IDs.add(cell.getStringCellValue());
          }
        
           //Get iterator to all the rows in current sheet
          int count = container.IDs.size();
          int height =sheet.getPhysicalNumberOfRows();
          sheet.groupColumn(1, height);
           HashSet<String> hash = new HashSet<String>();
          for (int i=1;i<height;i++){
        	  Row row2 = sheet.getRow(i);
        	  Cell cell2 = row2.getCell(0);
        	  switch(cell2.getCellType()) {
        	  case Cell.CELL_TYPE_FORMULA:
        		  //hash.add( String.valueOf(cell2.getDateCellValue()));
        		  break;
              case Cell.CELL_TYPE_BOOLEAN:
 
                  break;
              case Cell.CELL_TYPE_NUMERIC:
            	  //hash.add( String.valueOf(cell2.getNumericCellValue()));
      
                  break;
              case Cell.CELL_TYPE_STRING:
            	  //hash.add( cell2.getStringCellValue());
            	  
            	  if(temp.contains(cell2.getStringCellValue())){
            		Goodcount++;
            		//if(Goodcount >10) break;
            	    if(container.Probility.size()<=1){
            	    	int j =1;
            	    	while(j<=count) {
            	    		if(row2.getCell(j).getCellType() == Cell.CELL_TYPE_NUMERIC)
            	    		container.Probility.add(row2.getCell(j).getNumericCellValue());
            	    		else
            	    			container.Probility.add(0.0);	
            	    		j++;
            	    	}
            	    }else if (Goodcount <=10){
            	    	int j =1;
            	    	while(j<=count) {
            	    		if(row2.getCell(j).getCellType() == Cell.CELL_TYPE_NUMERIC){
            	    			double tempdou =container.Probility.get(j-1).doubleValue();
             	    		container.Probility.set(j-1, tempdou+row2.getCell(j).getNumericCellValue()) ;
            	    		}
            	    	
            	    		j++;
            	    	}
            	    }
            	  };
                  break;
          }
        	  
          }
          
          /*for(int i = 0;i<temp.size();i++){
        	  if(hash.contains(temp.get(i))!= true) temp.remove(i);
          }*/
          
          
          if (Goodcount >1){
        	 
        	  int k =1;
        	  while(k<= count ){
        		  double div = Goodcount*1.0;
        		  if (Goodcount > 10) div=10.0;
        		  double tempdou =container.Probility.get(k-1).doubleValue()/div;
   	    		container.Probility.set(k-1, tempdou) ;
   	    		k++;
        	  }
        	  
          }
        	  
		  workbook=null;
		  file.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	               
	
	Calculate_All_Dryer_info.visited ++;
	Calculate_All_Dryer_info.Agentinput=container;
	  return container;
	 
  }
}
