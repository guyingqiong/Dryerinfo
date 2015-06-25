package CScoreCode;

import java.io.IOException;

public class Calculate_33333_Dryer_Info {

	//take the input from outside
		public static double  Calculate_33333_Dryer(String G_IRU,String G_ITM_AGE2,String G_MDL_NO,String G_MFG_BND_NM,String Word_Bank){
			try {
				
				MyCustomClass ProResults = ReadHistoryData.ReadData(Word_Bank);
				//this value needs to be modified ..
				if(ProResults ==null) return  0.0101763293;
				
				int IRUvalue =G_IRU(G_IRU); 
				
				int _DM_BAD  = 0;
			
						 
						 
						// *** Generate dummy variables for G_IRU ; 
						 double _1_0 =0.0 ,_1_1  =0.0,_1_2 =0.0, _1_3 =0.0 ,_1_4 =0.0, _1_5  =0.0,_1_6 =0.0 ,_1_7  =0.0,_1_8 =0.0, _1_9 =0.0  ;
						  IRUvalue =G_IRU(G_IRU);
						 if (IRUvalue == -1) _DM_BAD = 1;
						 int _dm_find = 0;
						 
						 if (IRUvalue == 0)  { 
			                _1_0 = 1.0; 
			                _dm_find = 1; 
						 }
						 
						 if (IRUvalue == 1 ) {
		                   _1_1 = 1.0; 
		                   _dm_find = 1; 
						 }
					    
						 if (IRUvalue == 2 ) {
			                   _1_2 = 1.0; 
			                   _dm_find = 1; 
						}
						
						 if (IRUvalue == 3)  { 
				                _1_3 = 1.0; 
				                _dm_find = 1; 
							 }
							 
							 if (IRUvalue == 4 ) {
			                   _1_4 = 1.0; 
			                   _dm_find = 1; 
							 }
						    
							 if (IRUvalue == 5 ) {
				                   _1_5 = 1.0; 
				                   _dm_find = 1; 
							}
						 
							 if (IRUvalue == 6 ) {
				                   _1_6 = 1.0; 
				                   _dm_find = 1; 
								 }
							    
								 if (IRUvalue == 7 ) {
					                   _1_7 = 1.0; 
					                   _dm_find = 1; 
								}
								
								 if (IRUvalue == 8)  { 
						                _1_8 = 1.0; 
						                _dm_find = 1; 
									 }
									 
									 if (IRUvalue == 9 ) {
					                   _1_9 = 1.0; 
					                   _dm_find = 1; 
									 }
								    
									
							
								 if (IRUvalue ==10) {
					                _1_0 = -1.0; 
					                _1_1 = -1.0; 
					                _1_2 = -1.0; 
					                _1_3 = -1.0; 
					                _1_4 = -1.0; 
					                _1_5 = -1.0; 
					                _1_6 = -1.0; 
					                _1_7 = -1.0; 
					                _1_8 = -1.0; 
					                _1_9 = -1.0; 
					               
					    
					                _dm_find = 1; 
								 } 
								 
								 if (_dm_find == 0)
									 _DM_BAD =1;
								 
								 
								/* //*** Generate dummy variables for G_ITM_AGE2 ; 
								 int _2_0=0, _2_1=0, _2_2=0,_2_3=0 ;
								 G_ITM_AGE2Value =G_ITM_AGE2(G_ITM_AGE2);
								 if(G_ITM_AGE2Value  == -1) _DM_BAD = 1; 
								 _dm_find = 0;
								 
								 if (G_ITM_AGE2Value == 0 ) { 
					             _2_0 = 1; 
					             _dm_find = 1; 
								 }
								
								 if (G_ITM_AGE2Value == 1 ) { 
						             _2_1 = 1; 
						             _dm_find = 1; 
								}
								 
								 if (G_ITM_AGE2Value == 2 ) { 
						             _2_2 = 1; 
						             _dm_find = 1; 
									 } 
								 if (G_ITM_AGE2Value == 3 ) { 
						             _2_3 = 1; 
						             _dm_find = 1; 
									 } 
									 
								if (G_ITM_AGE2Value == 4 ) { 
									_2_0 = -1; 
						             _2_1 = -1; 
						             _2_2 = -1; 
						             _2_3 = -1;
							             _dm_find = 1; 
										 } 
								 if (_dm_find == 0)
									 _DM_BAD =1;*/
								 
					
						
				/*		
				 //*** Generate dummy variables for G_MFG_BND_NM ; 
					int _3_0 =0, _3_1=0, _3_2=0 , _3_3=0, _3_4=0;
					G_MFG_BND_NMValue = G_MFG_BND_NM(G_MFG_BND_NM);
					if (G_MFG_BND_NMValue ==-1) _DM_BAD = 1;
					
					if (G_MFG_BND_NMValue == 0 ) {
				       _3_0 = 1; 

					}
					else if (G_MFG_BND_NMValue == 1 ) {

					       _3_1 = 1; 
	 
						}
					else if (G_MFG_BND_NMValue == 2 ) {

					       _3_2 = 1; 

							}
					else if (G_MFG_BND_NMValue == 3 ) {

					       _3_3 = 1; 

					 }else if (G_MFG_BND_NMValue == 4 ) {
						 
					       _3_4 = 1; 

					 }else if (G_MFG_BND_NMValue == 5 ) {
						   _3_0 = -1; 
					       _3_1 = -1; 
					       _3_2 = -1; 
					       _3_3 = -1; 
					       _3_4 = -1;
					 }else _DM_BAD = 1; */
					
					 //*** If missing inputs, use averages; using Fengchun;s code, no idea about it 
					 if (_DM_BAD > 0 ) return  0.0101763293;
					    //_P0 = 0.1045190843; 
					    //_P1 = 0.8954809157; 
					
					// *** Compute Linear Predictor; 
					 double _TEMP; 
					 double  _LP0 =0.0; 
					 
					 
					  
					 //***  Effect: G_IRU ; 
					 _TEMP = 1; 
					 _LP0 = _LP0 + (    2.53865085804575) * _TEMP * _1_0; 
					 _LP0 = _LP0 + (    2.10765244793258) * _TEMP * _1_1; 
					 _LP0 = _LP0 + (    1.76975501587478) * _TEMP * _1_2; 
					 _LP0 = _LP0 + (    1.45636761273354) * _TEMP * _1_3; 
					 _LP0 = _LP0 + (    1.24533025773745) * _TEMP * _1_4; 
					 _LP0 = _LP0 + (    1.02792848848955) * _TEMP * _1_5; 
					 _LP0 = _LP0 + (     0.6681956427614) * _TEMP * _1_6; 
					 _LP0 = _LP0 + (    0.37868175060296) * _TEMP * _1_7; 
					 _LP0 = _LP0 + (    0.02053734226482) * _TEMP * _1_8; 
					 _LP0 = _LP0 + (   -0.61024638801057) * _TEMP * _1_9; 

					  
					/*// ***  Effect: G_ITM_AGE2 ; 
					 _TEMP = 1; 
					 _LP0 = _LP0 + (    0.20880391882226) * _TEMP * _2_0; 
					 _LP0 = _LP0 + (    0.47301090975058) * _TEMP * _2_1; 
					 _LP0 = _LP0 + (    0.08986648896825) * _TEMP * _2_2; 
					 _LP0 = _LP0 + (   -0.54932505913167) * _TEMP * _2_3; */

					  
					
					  
					 
					 _TEMP =    -4.98965595615821 + _LP0; 
					 if (_TEMP < 0) {
					    _TEMP = Math.exp(_TEMP); 
					    return _TEMP / (1.0 + _TEMP); 
					 }
					 else return 1.0 / (1.0 + Math.exp(-_TEMP)); 
					 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0.0;
		}
		//Take the input to get the G_IRU
		public static int G_IRU(String _Format){
			
			if (_Format == null || _Format.isEmpty()) return 9; 
		
			//else if (_Format.contains("4766_A"))  return  6; 
			else if (_Format.contains("4766_A"))  return    10; 
			 else if (_Format.contains("4766_C"))  return    10; 
			 else if (_Format.contains("4766_E"))  return    9; 
			 else if (_Format.contains("4766_G"))  return    5; 
			 else if (_Format.contains("4766_I"))  return    8; 
			 else if (_Format.contains("4766_J"))  return    10; 
			 else if (_Format.contains("4766_K"))  return    10; 
			 else if (_Format.contains("4766_L"))  return    10; 
			 else if (_Format.contains("4766_S"))  return    0; 
			 else if (_Format.contains("4766_T"))  return    10; 
			 else if (_Format.contains("6141_A"))  return    10; 
			 else if (_Format.contains("6141_B"))  return    9; 
			 else if (_Format.contains("6141_C"))  return    10; 
			 else if (_Format.contains("6141_E"))  return    10; 
			 else if (_Format.contains("6141_F"))  return    10; 
			 else if (_Format.contains("6141_G"))  return    6; 
			 else if (_Format.contains("6141_H"))  return    9; 
			 else if (_Format.contains("6141_I"))  return    10; 
			 else if (_Format.contains("6141_J"))  return    6; 
			 else if (_Format.contains("6141_K"))  return    10; 
			 else if (_Format.contains("6141_L"))  return    4; 
			 else if (_Format.contains("6877_B"))  return    5; 
			 else if (_Format.contains("6877_E"))  return    6; 
			 else if (_Format.contains("7084_A"))  return    7; 
			 else if (_Format.contains("7084_B"))  return    10; 
			 else if (_Format.contains("7084_C"))  return    8; 
			 else if (_Format.contains("7084_D"))  return    6; 
			 else if (_Format.contains("7084_E"))  return    10; 
			 else if (_Format.contains("7084_F"))  return    5; 
			 else if (_Format.contains("7084_G"))  return    8; 
			 else if (_Format.contains("7084_H"))  return    1; 
			 else if (_Format.contains("7084_I"))  return    6; 
			 else if (_Format.contains("7084_J"))  return    0; 
			 else if (_Format.contains("7084_L"))  return    4; 
			 else if (_Format.contains("7108_M"))  return    8; 
			 else if (_Format.contains("7108_N"))  return    8; 
			 else if (_Format.contains("7108_O"))  return    7; 
			 else if (_Format.contains("7108_S"))  return    4; 
			 else if (_Format.contains("7108_T"))  return    5; 
			 else if (_Format.contains("7108_X"))  return    6; 
			 else if (_Format.contains("7194_A"))  return    5; 
			 else if (_Format.contains("7194_C"))  return    3; 
			 else if (_Format.contains("7194_E"))  return    6; 
			 else if (_Format.contains("7194_F"))  return    9; 
			 else if (_Format.contains("7194_G"))  return    2; 
			 else if (_Format.contains("7194_H"))  return    7; 
			 else if (_Format.contains("7194_L"))  return    10; 
			 else if (_Format.contains("7194_M"))  return    6; 
			 else if (_Format.contains("7194_N"))  return    5; 
			 else if (_Format.contains("7194_O"))  return    10; 
			 else if (_Format.contains("7194_P"))  return    4; 
			 else if (_Format.contains("7194_U"))  return    7; 
			 else if (_Format.contains("7289_A"))  return    10; 
			 else if (_Format.contains("7323_C"))  return    3; 
			 else if (_Format.contains("7323_E"))  return    8; 
			 else if (_Format.contains("7385_C"))  return    10; 
			 else if (_Format.contains("7385_E"))  return    10; 
			 else if (_Format.contains("7385_F"))  return    9; 
			 else if (_Format.contains("7385_G"))  return    10; 
			 else if (_Format.contains("7385_H"))  return    10; 
			 else if (_Format.contains("7385_I"))  return    4; 
			 else if (_Format.contains("7385_J"))  return    10; 
			 else if (_Format.contains("7385_L"))  return    7; 
			 else if (_Format.contains("7385_M"))  return    10; 
			 else if (_Format.contains("7385_N"))  return    8; 
			 else if (_Format.contains("7385_O"))  return    1; 
			 else if (_Format.contains("7385_P"))  return    10; 
			 else if (_Format.contains("7385_Q"))  return    10; 
			 else if (_Format.contains("7385_R"))  return    10; 
			 else if (_Format.contains("7385_S"))  return    10; 
			 else if (_Format.contains("7385_T"))  return    6; 
			 else if (_Format.contains("7385_V"))  return    10; 
			 else if (_Format.contains("7385_W"))  return    10; 
			 else if (_Format.contains("7385_Z"))  return    10; 
			 else if (_Format.contains("7435DD"))  return    4; 
			 else if (_Format.contains("7435EE"))  return    8; 
			 else if (_Format.contains("7435_A"))  return    8; 
			 else if (_Format.contains("7435_B"))  return    9; 
			 else if (_Format.contains("7435_C"))  return    6; 
			 else if (_Format.contains("7435_F"))  return    3; 
			 else if (_Format.contains("7670_B"))  return    8; 
			 else if (_Format.contains("7670_D"))  return    7; 
			 else if (_Format.contains("7670_F"))  return    7; 
			 else if (_Format.contains("7670_G"))  return    9; 
			 else if (_Format.contains("7670_I"))  return    10; 
			 else if (_Format.contains("7670_K"))  return    6; 
			 else if (_Format.contains("7670_M"))  return    7; 
			 else if (_Format.contains("7670_P"))  return    6; 
			 else if (_Format.contains("7670_R"))  return    10; 
			 else if (_Format.contains("7670_S"))  return    10; 
			 else if (_Format.contains("7670_T"))  return    7; 
			 else if (_Format.contains("7670_V"))  return    10; 
			 else if (_Format.contains("7670_W"))  return    10; 
			 else if (_Format.contains("7670_X"))  return    10; 
			 else if (_Format.contains("7744_A"))  return    9; 
			 else if (_Format.contains("7744_B"))  return    7; 
			 else if (_Format.contains("7744_C"))  return    2; 
			 else if (_Format.contains("7744_D"))  return    6; 
			 else if (_Format.contains("7744_H"))  return    10; 
			 else if (_Format.contains("7744_J"))  return    9; 
			 else if (_Format.contains("7744_K"))  return    10; 
			 else if (_Format.contains("7744_N"))  return    1; 
			 else if (_Format.contains("7744_S"))  return    8; 
			 else if (_Format.contains("7900C3"))  return    7; 
			 else if (_Format.contains("7900E3"))  return    10; 
			 else if (_Format.contains("7900E5"))  return    8; 
			 else if (_Format.contains("7900F6"))  return    9; 
			 else if (_Format.contains("7900G4"))  return    7; 
			 else if (_Format.contains("7900N3"))  return    10; 
			 else if (_Format.contains("7900N7"))  return    5; 
			 else if (_Format.contains("7900O1"))  return    10; 
			 else if (_Format.contains("7900R6"))  return    10; 
			 else if (_Format.contains("7900T4"))  return    8; 
			 else if (_Format.contains("7900U3"))  return    10; 
			 else if (_Format.contains("7908F2"))  return    4; 
			 else if (_Format.contains("7908I5"))  return    10; 
			 else if (_Format.contains("7908L1"))  return    6; 
			 else if (_Format.contains("7908M1"))  return    8; 
			 else if (_Format.contains("7908M2"))  return    10; 
			 else if (_Format.contains("7983_J"))  return    8; 
			 else if (_Format.contains("7983_K"))  return    6; 
			 else if (_Format.contains("7983_L"))  return    8; 
			 else if (_Format.contains("7983_M"))  return    6; 
			 else if (_Format.contains("7983_N"))  return    7; 
			 else if (_Format.contains("7983_O"))  return    6; 
			 else if (_Format.contains("7983_P"))  return    4; 
			 else if (_Format.contains("8035_A"))  return    10; 
			 else if (_Format.contains("8035_B"))  return    6; 
			 else if (_Format.contains("8035_C"))  return    10; 
			 else if (_Format.contains("8035_E"))  return    6; 
			 else if (_Format.contains("8035_F"))  return    7; 
			 else if (_Format.contains("8035_G"))  return    5; 
			 else if (_Format.contains("8035_H"))  return    5; 
			 else if (_Format.contains("8035_I"))  return    10; 
			 else if (_Format.contains("8035_J"))  return    5; 
			 else if (_Format.contains("8035_M"))  return    10; 
			 else if (_Format.contains("8035_O"))  return    10; 
			 else if (_Format.contains("8035_P"))  return    10; 
			 else if (_Format.contains("8035_Q"))  return    10; 
			 else if (_Format.contains("8035_S"))  return    10; 
			 else if (_Format.contains("8035_T"))  return    6; 
			 else if (_Format.contains("8035_U"))  return    7; 
			 else if (_Format.contains("8035_V"))  return    10; 
			 else if (_Format.contains("8035_W"))  return    4; 
			 else if (_Format.contains("8035_Y"))  return    10; 
			 else if (_Format.contains("8035_Z"))  return    2; 
			 else if (_Format.contains("8038_I"))  return    10; 
			 else if (_Format.contains("8038_K"))  return    6; 
			 else if (_Format.contains("8038_L"))  return    8; 
			 else if (_Format.contains("8038_M"))  return    9; 
			 else if (_Format.contains("8038_N"))  return    7; 
			 else if (_Format.contains("8038_O"))  return    10; 
			 else if (_Format.contains("8038_Q"))  return    2; 
			 else if (_Format.contains("8038_S"))  return    3; 
			 else if (_Format.contains("8038_U"))  return    10; 
			 else if (_Format.contains("8038_V"))  return    10; 
			 else if (_Format.contains("8060R1"))  return    10; 
			 else if (_Format.contains("8060_A"))  return    6; 
			 else if (_Format.contains("8060_B"))  return    10; 
			 else if (_Format.contains("8060_C"))  return    10; 
			 else if (_Format.contains("8060_D"))  return    1; 
			 else if (_Format.contains("8060_E"))  return    6; 
			 else if (_Format.contains("8060_F"))  return    10; 
			 else if (_Format.contains("8060_G"))  return    5; 
			 else if (_Format.contains("8060_H"))  return    10; 
			 else if (_Format.contains("8060_I"))  return    7; 
			 else if (_Format.contains("8060_J"))  return    6; 
			 else if (_Format.contains("8060_L"))  return    4; 
			 else if (_Format.contains("8060_M"))  return    10; 
			 else if (_Format.contains("8060_N"))  return    10; 
			 else if (_Format.contains("8060_O"))  return    10; 
			 else if (_Format.contains("8060_P"))  return    10; 
			 else if (_Format.contains("8060_Q"))  return    10; 
			 else if (_Format.contains("8060_S"))  return    10; 
			 else if (_Format.contains("8060_T"))  return    1; 
			 else if (_Format.contains("8060_U"))  return    10; 
			 else if (_Format.contains("8060_V"))  return    10; 
			 else if (_Format.contains("8060_W"))  return    10; 
			 else if (_Format.contains("8060_X"))  return    10; 
			 else if (_Format.contains("8060_Z"))  return    10; 
			 else if (_Format.contains("8066AL"))  return    3; 
			 else if (_Format.contains("8066BR"))  return    6; 
			 else if (_Format.contains("8066DO"))  return    7; 
			 else if (_Format.contains("8066GP"))  return    10; 
			 else if (_Format.contains("8066HA"))  return    10; 
			 else if (_Format.contains("8066HO"))  return    6; 
			 else if (_Format.contains("8066JA"))  return    5; 
			 else if (_Format.contains("8066LA"))  return    5; 
			 else if (_Format.contains("8066MB"))  return    4; 
			 else if (_Format.contains("8066ME"))  return    5; 
			 else if (_Format.contains("8066MG"))  return    2; 
			 else if (_Format.contains("8066NO"))  return    5; 
			 else if (_Format.contains("8066PC"))  return    10; 
			 else if (_Format.contains("8066PN"))  return    8; 
			 else if (_Format.contains("8066SL"))  return    10; 
			 else if (_Format.contains("8066SM"))  return    10; 
			 else if (_Format.contains("8066ZZ"))  return    10; 
			 else if (_Format.contains("8078_A"))  return    5; 
			 else if (_Format.contains("8078_B"))  return    2; 
			 else if (_Format.contains("8078_C"))  return    6; 
			 else if (_Format.contains("8078_D"))  return    5; 
			 else if (_Format.contains("8078_E"))  return    7; 
			 else if (_Format.contains("8078_N"))  return    6; 
			 else if (_Format.contains("8078_V"))  return    10; 
			 else if (_Format.contains("8101_C"))  return    10; 
			 else if (_Format.contains("8101_K"))  return    8; 
			 else if (_Format.contains("8101_S"))  return    10; 
			 else if (_Format.contains("8101_T"))  return    10; 
			 else if (_Format.contains("8101_W"))  return    10; 
			 else if (_Format.contains("8101_X"))  return    10; 
			 else if (_Format.contains("8101_Y"))  return    4; 
			 else if (_Format.contains("8101_Z"))  return    10; 
			 else if (_Format.contains("8107_A"))  return    7; 
			 else if (_Format.contains("8107_C"))  return    10; 
			 else if (_Format.contains("8107_D"))  return    8; 
			 else if (_Format.contains("8107_E"))  return    3; 
			 else if (_Format.contains("8107_F"))  return    6; 
			 else if (_Format.contains("8107_L"))  return    8; 
			 else if (_Format.contains("8107_S"))  return    8; 
			 else if (_Format.contains("8129_A"))  return    10; 
			 else if (_Format.contains("8129_B"))  return    10; 
			 else if (_Format.contains("8129_C"))  return    10; 
			 else if (_Format.contains("8129_E"))  return    6; 
			 else if (_Format.contains("8129_F"))  return    9; 
			 else if (_Format.contains("8129_G"))  return    8; 
			 else if (_Format.contains("8129_O"))  return    10; 
			 else if (_Format.contains("8129_P"))  return    10; 
			 else if (_Format.contains("8129_Q"))  return    6; 
			 else if (_Format.contains("8129_R"))  return    10; 
			 else if (_Format.contains("8129_S"))  return    8; 
			 else if (_Format.contains("8129_U"))  return    10; 
			 else if (_Format.contains("8129_V"))  return    8; 
			 else if (_Format.contains("8129_W"))  return    10; 
			 else if (_Format.contains("8129_X"))  return    8; 
			 else if (_Format.contains("8129_Y"))  return    10; 
			 else if (_Format.contains("8129_Z"))  return    7; 
			 else if (_Format.contains("8147_A"))  return    5; 
			 else if (_Format.contains("8147_C"))  return    6; 
			 else if (_Format.contains("8147_D"))  return    1; 
			 else if (_Format.contains("8147_E"))  return    4; 
			 else if (_Format.contains("8147_F"))  return    5; 
			 else if (_Format.contains("8147_G"))  return    6; 
			 else if (_Format.contains("8147_L"))  return    8; 
			 else if (_Format.contains("8147_O"))  return    7; 
			 else if (_Format.contains("8150F1"))  return    10; 
			 else if (_Format.contains("8150_A"))  return    10; 
			 else if (_Format.contains("8150_B"))  return    10; 
			 else if (_Format.contains("8150_C"))  return    10; 
			 else if (_Format.contains("8150_E"))  return    7; 
			 else if (_Format.contains("8150_G"))  return    10; 
			 else if (_Format.contains("8150_I"))  return    8; 
			 else if (_Format.contains("8150_K"))  return    10; 
			 else if (_Format.contains("8150_L"))  return    7; 
			 else if (_Format.contains("8150_O"))  return    10; 
			 else if (_Format.contains("8150_P"))  return    9; 
			 else if (_Format.contains("8150_Q"))  return    6; 
			 else if (_Format.contains("8150_R"))  return    5; 
			 else if (_Format.contains("8150_S"))  return    10; 
			 else if (_Format.contains("8150_T"))  return    10; 
			 else if (_Format.contains("8150_W"))  return    10; 
			 else if (_Format.contains("8151_B"))  return    10; 
			 else if (_Format.contains("8151_C"))  return    10; 
			 else if (_Format.contains("8151_E"))  return    9; 
			 else if (_Format.contains("8151_G"))  return    10; 
			 else if (_Format.contains("8151_K"))  return    10; 
			 else if (_Format.contains("8151_L"))  return    10; 
			 else if (_Format.contains("8151_N"))  return    10; 
			 else if (_Format.contains("8158_C"))  return    2; 
			 else if (_Format.contains("8158_D"))  return    5; 
			 else if (_Format.contains("8158_K"))  return    10; 
			 else if (_Format.contains("8158_L"))  return    10; 
			 else if (_Format.contains("8158_M"))  return    10; 
			 else if (_Format.contains("8158_O"))  return    8; 
			 else if (_Format.contains("8162_A"))  return    10; 
			 else if (_Format.contains("8162_B"))  return    10; 
			 else if (_Format.contains("8162_E"))  return    10; 
			 else if (_Format.contains("8162_F"))  return    10; 
			 else if (_Format.contains("8162_H"))  return    6; 
			 else if (_Format.contains("8162_I"))  return    6; 
			 else if (_Format.contains("8162_K"))  return    10; 
			 else if (_Format.contains("8162_L"))  return    10; 
			 else if (_Format.contains("8162_M"))  return    10; 
			 else if (_Format.contains("8162_N"))  return    7; 
			 else if (_Format.contains("8162_Q"))  return    7; 
			 else if (_Format.contains("8162_R"))  return    10; 
			 else if (_Format.contains("8162_X"))  return    10; 
			 else if (_Format.contains("8162_Z"))  return    3; 
			 else if (_Format.contains("8175_A"))  return    10; 
			 else if (_Format.contains("8175_B"))  return    5; 
			 else if (_Format.contains("8175_D"))  return    10; 
			 else if (_Format.contains("8175_E"))  return    10; 
			 else if (_Format.contains("8175_F"))  return    10; 
			 else if (_Format.contains("8175_G"))  return    7; 
			 else if (_Format.contains("8175_H"))  return    10; 
			 else if (_Format.contains("8175_I"))  return    10; 
			 else if (_Format.contains("8180_A"))  return    10; 
			 else if (_Format.contains("8180_B"))  return    10; 
			 else if (_Format.contains("8180_C"))  return    10; 
			 else if (_Format.contains("8180_D"))  return    3; 
			 else if (_Format.contains("8180_E"))  return    3; 
			 else if (_Format.contains("8180_F"))  return    4; 
			 else if (_Format.contains("8180_G"))  return    3; 
			 else if (_Format.contains("8180_H"))  return    10; 
			 else if (_Format.contains("8180_I"))  return    10; 
			 else if (_Format.contains("8180_J"))  return    10; 
			 else if (_Format.contains("8180_K"))  return    6; 
			 else if (_Format.contains("8180_L"))  return    10; 
			 else if (_Format.contains("8180_M"))  return    2; 
			 else if (_Format.contains("8181_A"))  return    8; 
			 else if (_Format.contains("8181_F"))  return    7; 
			 else if (_Format.contains("8181_S"))  return    10; 
			 else if (_Format.contains("8181_W"))  return    10; 
			 else if (_Format.contains("8206F"))  return    10; 
			 else if (_Format.contains("8206MC"))  return    10; 
			 else if (_Format.contains("8206MG"))  return    7; 
			 else if (_Format.contains("8206T"))  return    6; 
			 else if (_Format.contains("8206_A"))  return    10; 
			 else if (_Format.contains("8206_B"))  return    10; 
			 else if (_Format.contains("8206_C"))  return    10; 
			 else if (_Format.contains("8206_D"))  return    10; 
			 else if (_Format.contains("8206_G"))  return    3; 
			 else if (_Format.contains("8206_H"))  return    10; 
			 else if (_Format.contains("8206_I"))  return    0; 
			 else if (_Format.contains("8206_J"))  return    10; 
			 else if (_Format.contains("8206_K"))  return    10; 
			 else if (_Format.contains("8206_L"))  return    7; 
			 else if (_Format.contains("8206_M"))  return    10; 
			 else if (_Format.contains("8206_N"))  return    2; 
			 else if (_Format.contains("8206_O"))  return    10; 
			 else if (_Format.contains("8206_P"))  return    6; 
			 else if (_Format.contains("8206_R"))  return    10; 
			 else if (_Format.contains("8206_S"))  return    10; 
			 else if (_Format.contains("8206_V"))  return    5; 
			 else if (_Format.contains("8227_A"))  return    7; 
			 else if (_Format.contains("8227_C"))  return    4; 
			 else if (_Format.contains("8227_D"))  return    10; 
			 else if (_Format.contains("8227_E"))  return    10; 
			 else if (_Format.contains("8227_F"))  return    2; 
			 else if (_Format.contains("8227_G"))  return    10; 
			 else if (_Format.contains("8227_H"))  return    10; 
			 else if (_Format.contains("8227_I"))  return    7; 
			 else if (_Format.contains("8245_A"))  return    10; 
			 else if (_Format.contains("8245_B"))  return    10; 
			 else if (_Format.contains("8245_C"))  return    6; 
			 else if (_Format.contains("8245_F"))  return    4; 
			 else if (_Format.contains("8245_L"))  return    6; 
			 else if (_Format.contains("8245_N"))  return    4; 
			 else if (_Format.contains("8245_W"))  return    10; 
			 else if (_Format.contains("8254_A"))  return    5; 
			 else if (_Format.contains("8254_B"))  return    6; 
			 else if (_Format.contains("8254_C"))  return    10; 
			 else if (_Format.contains("8254_D"))  return    10; 
			 else if (_Format.contains("8254_E"))  return    10; 
			 else if (_Format.contains("8254_F"))  return    8; 
			 else if (_Format.contains("8254_G"))  return    3; 
			 else if (_Format.contains("8254_H"))  return    10; 
			 else if (_Format.contains("8254_I"))  return    10; 
			 else if (_Format.contains("8254_J"))  return    10; 
			 else if (_Format.contains("8254_K"))  return    10; 
			 else if (_Format.contains("8254_L"))  return    10; 
			 else if (_Format.contains("8254_M"))  return    10; 
			 else if (_Format.contains("8254_N"))  return    10; 
			 else if (_Format.contains("8254_O"))  return    7; 
			 else if (_Format.contains("8254_P"))  return    4; 
			 else if (_Format.contains("8254_R"))  return    10; 
			 else if (_Format.contains("8320_G"))  return    8; 
			 else if (_Format.contains("8320_H"))  return    6; 
			 else if (_Format.contains("8320_I"))  return    5; 
			 else if (_Format.contains("8320_L"))  return    6; 
			 else if (_Format.contains("8320_M"))  return    6; 
			 else if (_Format.contains("8320_P"))  return    8; 
			 else if (_Format.contains("8320_X"))  return    4; 
			 else if (_Format.contains("8368_A"))  return    4; 
			 else if (_Format.contains("8368_D"))  return    5; 
			 else if (_Format.contains("8368_G"))  return    6; 
			 else if (_Format.contains("8368_J"))  return    10; 
			 else if (_Format.contains("8368_O"))  return    4; 
			 else if (_Format.contains("8368_P"))  return    4; 
			 else if (_Format.contains("8368_R"))  return    4; 
			 else if (_Format.contains("8368_S"))  return    5; 
			 else if (_Format.contains("8368_X"))  return    8; 
			 else if (_Format.contains("8935_A"))  return    8; 
			 else if (_Format.contains("8935_B"))  return    7; 
			 else if (_Format.contains("8935_C"))  return    10; 
			 else if (_Format.contains("8935_D"))  return    10; 
			 else if (_Format.contains("8935_F"))  return    4; 
			 else if (_Format.contains("8935_M"))  return    8; 
			 else if (_Format.contains("8935_P"))  return    10; 
			 else if (_Format.contains("8935_S"))  return    10; 
			 else if (_Format.contains("8935_T"))  return    8; 
			 else if (_Format.contains("9197_A"))  return    8; 
			 else if (_Format.contains("9263_A"))  return    1; 
			 else if (_Format.contains("9265_A"))  return    10; 
			 else if (_Format.contains("9266_A"))  return    10; 
			 else if (_Format.contains("9650_A"))  return    8; 
			 else if (_Format.contains("9650_B"))  return    9; 
			 else if (_Format.contains("9650_C"))  return    6; 
			 else if (_Format.contains("9663_A"))  return    8; 
			 else if (_Format.contains("9664_A"))  return    8; 
			 else if (_Format.contains("9665_A"))  return    8; 
			 else if (_Format.contains("9700_A"))  return    6; 
			 else if (_Format.contains("9700_D"))  return    9; 
			 else if (_Format.contains("9701_A"))  return    8; 
			 else if (_Format.contains("9701_B"))  return    7; 
			 else if (_Format.contains("9701_C"))  return    3; 
			 else if (_Format.contains("9702_A"))  return    6; 
			 else if (_Format.contains("9702_S"))  return    5; 
			 else if (_Format.contains("9702_V"))  return    8; 
			 else if (_Format.contains("9709_A"))  return    5; 
			 else if (_Format.contains("9710_A"))  return    8; 
			 else if (_Format.contains("9712_A"))  return    8; 
			 else if (_Format.contains("9717_A"))  return    6; 
			 else if (_Format.contains("9720_A"))  return    6; 
			 else if (_Format.contains("9722_A"))  return    8; 
			 else if (_Format.contains("9727_A"))  return    7; 
			 else if (_Format.contains("9727_N"))  return    6; 
			 else if (_Format.contains("9729_A"))  return    7; 
			 else if (_Format.contains("9729_S"))  return    7; 
			 else if (_Format.contains("9734_A"))  return    7; 
			 else if (_Format.contains("9759_A"))  return    8; 
			 else if (_Format.contains("9759_B"))  return    7; 
			 else if (_Format.contains("9759_N"))  return    6; 
			 else if (_Format.contains("9780_A"))  return    5; 
			 else if (_Format.contains("9780_M"))  return    9; 
			 else if (_Format.contains("9784_A"))  return    5; 
			 else if (_Format.contains("9787_A"))  return    8; 
			
			return -2;
		}
		
		//Take the input to get the G_ITM_AGE2
		public static int G_ITM_AGE2(String _Format){
			
			if (_Format == null || _Format.isEmpty()) return -1;
			
			if (_Format.equalsIgnoreCase("1"))  return 0; 
			else if (_Format.equalsIgnoreCase("2")) return 1; 
			else if (_Format.equalsIgnoreCase("3")) return 1; 
			else if (_Format.equalsIgnoreCase("5")) return 2; 
			else if (_Format.equalsIgnoreCase("8")) return 3; 
			else if (_Format.equalsIgnoreCase("12")) return 4; 
			else if (_Format.equalsIgnoreCase("19")) return 4; 
			else if (_Format.equalsIgnoreCase("20")) return 4; 
			
			return -2;
		}
		
		//Take the input to get the G_MDL_NO
		public static int G_MDL_NO(String _Format){
			
			if (_Format == null || _Format.isEmpty()) return -1;
			    if (_Format.equalsIgnoreCase("1"))  return 2; 
			else if (_Format.equalsIgnoreCase("4")) return 1; 
			else if (_Format.equalsIgnoreCase("7")) return 1; 
			else if (_Format.equalsIgnoreCase("D")) return 0; 
			else if (_Format.equalsIgnoreCase("G")) return 2; 
			else if (_Format.equalsIgnoreCase("M")) return 1; 
			else if (_Format.equalsIgnoreCase("W")) return 2; 
			else if (_Format.equalsIgnoreCase("_")) return 2; 
			
			return -2;
		}
		
		//Take the input to get the G_MFG_BND_NM
		public static int G_MFG_BND_NM(String _Format){
			if (_Format == null || _Format.isEmpty()) return 5; 
			
			else if (_Format.equalsIgnoreCase("ADMIRAL")) return  2; 
			 else if (_Format.equalsIgnoreCase("AMANA")) return  1; 
			 else if (_Format.equalsIgnoreCase("BOSCH")) return  5; 
			 else if (_Format.equalsIgnoreCase("CROSLEY")) return  5; 
			 else if (_Format.equalsIgnoreCase("ELECTROLUX")) return  5; 
			 else if (_Format.equalsIgnoreCase("ESTATE")) return  1; 
			 else if (_Format.equalsIgnoreCase("FISHERPAYKEL")) return  5; 
			 else if (_Format.equalsIgnoreCase("FRIGIDAIRE")) return  4; 
			 else if (_Format.equalsIgnoreCase("GALAXY")) return  5; 
			 else if (_Format.equalsIgnoreCase("GALLERY")) return  5; 
			 else if (_Format.equalsIgnoreCase("GE")) return  4; 
			 else if (_Format.equalsIgnoreCase("GE CAFE")) return  5; 
			 else if (_Format.equalsIgnoreCase("GE PROFILE")) return  4; 
			 else if (_Format.equalsIgnoreCase("GIBSON")) return  5; 
			 else if (_Format.equalsIgnoreCase("HAIER")) return  5; 
			 else if (_Format.equalsIgnoreCase("HOTPOINT")) return  4; 
			 else if (_Format.equalsIgnoreCase("INGLIS")) return  0; 
			 else if (_Format.equalsIgnoreCase("JENN-AIR")) return  5; 
			 else if (_Format.equalsIgnoreCase("KELVINATOR")) return  0; 
			 else if (_Format.equalsIgnoreCase("KENMORE")) return  3; 
			 else if (_Format.equalsIgnoreCase("KENMORE ELIT")) return  2; 
			 else if (_Format.equalsIgnoreCase("KIRKLAND")) return  5; 
			 else if (_Format.equalsIgnoreCase("KITCHENAID")) return  4; 
			 else if (_Format.equalsIgnoreCase("LG")) return  5; 
			 else if (_Format.equalsIgnoreCase("MAGIC CHEF")) return  0; 
			 else if (_Format.equalsIgnoreCase("MAYTAG")) return  1; 
			 else if (_Format.equalsIgnoreCase("MONTGMY WARD")) return  5; 
			 else if (_Format.equalsIgnoreCase("NORGE")) return  2; 
			 else if (_Format.equalsIgnoreCase("ROPER")) return  3; 
			 else if (_Format.equalsIgnoreCase("SAMSUNG")) return  5; 
			 else if (_Format.equalsIgnoreCase("SEARS")) return  4; 
			 else if (_Format.equalsIgnoreCase("WHIRLPOOL")) return  2; 
			 else if (_Format.equalsIgnoreCase("WHITE WESTIN")) return  0; 
			  
			return -2;
		}
}
