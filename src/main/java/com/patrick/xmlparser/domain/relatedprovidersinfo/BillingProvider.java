package com.patrick.xmlparser.domain.relatedprovidersinfo;

public class BillingProvider {

	private String taxonomyCode;
	
	private String personIndicator;
	
	private String lastName;
	
	private PrimaryIdentifier primaryIdentifier;
	
	private AddressInfo addressInfo;
	
	private String taxID;
	
	private String payerProviderNumber;
	
	
	private class PrimaryIdentifier{
		
		private String qualifier;
		
		private String identifier;
	}
}
