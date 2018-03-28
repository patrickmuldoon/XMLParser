package com.patrick.xmlparser.domain.claimcobinfo.othersubscriberinfo.insuranceinfo;

public class PayerInfo {

	private String role;
	
	private String personIndicator;
	
	private String name;
	
	private PrimaryIdentifier primaryIdentifier;
	
	
	
	private class PrimaryIdentifier{
		
		private String qualifier;
		
		private String identifier;
		
	}
	
}
