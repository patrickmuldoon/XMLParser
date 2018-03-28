package com.patrick.xmlparser.domain.subscriberinfo.insuranceinfo;


public class PayerInfo {

	private String role;
	
	private String personIndicator;
	
	private String name;
	
	private PrimaryIdentifier primaryIdentifier;
	
	private OtherIdentifier otherIdentifier;
	
	private AddressInfo addressInfo;
	
	private String taxID;
	
	private class PrimaryIdentifier{
		
		private String qualifier;
		
		private String identifier;
		
	}
	
	private class AddressInfo{
		
		private String city;
		
		private String state;
		
		private String postalCode;
		
	}
	
	private class OtherIdentifier{
		
		private String qualifier;
		
		private String identifier;
		
	}
}
