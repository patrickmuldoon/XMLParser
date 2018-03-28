package com.patrick.xmlparser.domain.servicelineinfo.servicepaymenthistory;

import java.util.List;

public class ProcessedServiceInfo {

	private ServiceCodeInfo serviceCodeInfo;
	
	private String revenueCode;
	
	private String quantity;
	
	private class ServiceCodeInfo{
		
		private String qualifier;
		
		private String value;
		
		private List<ModifierInfo> modifierInfo;
		
		
		private class ModifierInfo{
			
			private String modifierCode;
			
		}
	}
	
}
