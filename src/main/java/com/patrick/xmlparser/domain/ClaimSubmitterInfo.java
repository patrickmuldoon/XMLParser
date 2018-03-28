package com.patrick.xmlparser.domain;

import com.patrick.xmlparser.domain.claimsubmitterinfo.ContactInfo;

public class ClaimSubmitterInfo {

	private String personIndicator;
	
	private String name;
	
	private OtherIdentifier otherIdentifier;
	
	private ContactInfo contactInfo;
	
	
	
	
	
	
	
	private class OtherIdentifier{
		
		private String qualifier;
		
		private String identifier;
		
	}

}
