package com.Dryer.wsServer;

import java.util.Map;

import javax.jws.WebService;

@WebService

public class DryerInfo {
	private static final String SALUTATION = "Hello";
	
	 public String getGreeting( String name ) {
	  return SALUTATION + " " + name;
	 }
	 
	 public Map<String,Double> getTop3results( String G_IRU,String G_ITM_AGE2,String G_MDL_NO,String G_MFG_BND_NM,String cvg_cd,String Word_Bank) {
		  
		 return Calculate_All_Dryer_info.Calculate_All_Dryer_infomation(G_IRU,G_ITM_AGE2,G_MDL_NO,G_MFG_BND_NM,cvg_cd, Word_Bank);
		 }
	 
}
