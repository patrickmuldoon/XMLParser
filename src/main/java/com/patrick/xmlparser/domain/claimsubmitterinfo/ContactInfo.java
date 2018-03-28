package com.patrick.xmlparser.domain.claimsubmitterinfo;

public class ContactInfo {
	
	private String contractType;
	
	private String contactName;
	
	private CommunicationNumber communicationNumber;
	
	
	
	
	private class CommunicationNumber{
		
		private String identifier;
		
		private String qualifier;
		
	}
}
