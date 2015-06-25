package CScoreCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Calculate_All_Dryer_info {
	static MyCustomClass Agentinput ;//= new MyCustomClass();
	static int visited ;
	
	//take the input from outside
		public static Map<String,Double>   Calculate_All_Dryer_infomation(String G_IRU,String G_ITM_AGE2,String G_MDL_NO,String G_MFG_BND_NM,String cvg_cd,String Word_Bank){
			  Map<String, Double> results = new HashMap<String, Double>();
			  Calculate_All_Dryer_info.visited =0;
			results.put("00000", Calculate_00000_Dryer_Info.Calculate_00000_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("11111", Calculate_11111_Dryer_Info.Calculate_11111_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("11120", Calculate_11120_Dryer_Info.Calculate_11120_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("11130", Calculate_11130_Dryer_Info.Calculate_11130_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			
			results.put("12120", Calculate_12120_Dryer_Info.Calculate_12120_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("13130", Calculate_13130_Dryer_Info.Calculate_13130_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("13140", Calculate_13140_Dryer_Info.Calculate_13140_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("14220", Calculate_14220_Dryer_Info.Calculate_14220_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("14225", Calculate_14225_Dryer_Info.Calculate_14225_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("14230", Calculate_14230_Dryer_Info.Calculate_14230_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("14240", Calculate_14240_Dryer_Info.Calculate_14240_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("14320", Calculate_14320_Dryer_Info.Calculate_14320_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("16120", Calculate_16120_Dryer_Info.Calculate_16120_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("22222", Calculate_22222_Dryer_Info.Calculate_22222_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("26410", Calculate_26410_Dryer_Info.Calculate_26410_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("31210", Calculate_31210_Dryer_Info.Calculate_31210_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, cvg_cd, Word_Bank));
			  
			results.put("31220", Calculate_31220_Dryer_Info.Calculate_31220_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, cvg_cd,Word_Bank));
			results.put("32120", Calculate_32120_Dryer_Info.Calculate_32120_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("33333", Calculate_33333_Dryer_Info.Calculate_33333_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("34110", Calculate_34110_Dryer_Info.Calculate_34110_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("35720", Calculate_35720_Dryer_Info.Calculate_35720_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("36120", Calculate_36120_Dryer_Info.Calculate_36120_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("36410", Calculate_36410_Dryer_Info.Calculate_36410_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("37130", Calculate_37130_Dryer_Info.Calculate_37130_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("37220", Calculate_37220_Dryer_Info.Calculate_37220_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("38100", Calculate_38100_Dryer_Info.Calculate_38100_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("39130", Calculate_39130_Dryer_Info.Calculate_39130_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("39150", Calculate_39150_Dryer_Info.Calculate_39150_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("39320", Calculate_39320_Dryer_Info.Calculate_39320_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("39330", Calculate_39330_Dryer_Info.Calculate_39330_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("44444", Calculate_44444_Dryer_Info.Calculate_44444_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("55555", Calculate_55555_Dryer_Info.Calculate_55555_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			 
			results.put("56110", Calculate_56110_Dryer_Info.Calculate_56110_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("56132", Calculate_56132_Dryer_Info.Calculate_56132_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("56140", Calculate_56140_Dryer_Info.Calculate_56140_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("56320", Calculate_56320_Dryer_Info.Calculate_56320_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("66666", Calculate_66666_Dryer_Info.Calculate_66666_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("71130", Calculate_71130_Dryer_Info.Calculate_71130_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("73120", Calculate_73120_Dryer_Info.Calculate_73120_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("73420", Calculate_73420_Dryer_Info.Calculate_73420_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("75110", Calculate_75110_Dryer_Info.Calculate_75110_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("77777", Calculate_77777_Dryer_Info.Calculate_77777_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			results.put("93950", Calculate_93950_Dryer_Info.Calculate_93950_Dryer(G_IRU, G_ITM_AGE2, G_MDL_NO, G_MFG_BND_NM, Word_Bank));
			Calculate_All_Dryer_info.visited =0;
			
			double max = Collections.max(results.values());
			Map<String, Double> top3 = new  HashMap<String, Double>();
			Set<String> keys = new HashSet<String>();
			Map<String, Double> results2 = new  HashMap<String, Double>();
			Map<String, Double> results3 = new  HashMap<String, Double>();
			
	        for(Map.Entry entry: results.entrySet()){
	            if(entry.getValue().equals(max)){
	                keys.add((String) entry.getKey()); //no break, looping entire hashtable
	               
	                top3.put(entry.getKey().toString(), max);
	                
	               
	            }
	            else
	            	results2.put(entry.getKey().toString(), (Double) entry.getValue());
	        }
	        
	        if(top3.size() <3){
	        	double max1 = Collections.max(results2.values());
	        	 for(Map.Entry entry: results.entrySet()){
	                 if(entry.getValue().equals(max1)){               
	                     top3.put(entry.getKey().toString(), max1);
	                    
	                 }else{
	                	 if(entry.getValue().equals(max) == false)
	                	 results3.put(entry.getKey().toString(), (Double) entry.getValue());
	                 }
	             }
	        }
	        
	        if(top3.size() <3){
	        	double max2 = Collections.max(results3.values());
	        	 for(Map.Entry entry: results3.entrySet()){
	                 if(entry.getValue().equals(max2)){               
	                     top3.put(entry.getKey().toString(), max2);
	                     
	                 }
	             }
	        }
	        return top3;
			//return results;
		}
		
}
