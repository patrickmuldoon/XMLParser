package com.patrick.xmlparser.domain;

import com.patrick.xmlparser.domain.subscriberinfo.EnrollmentInfo;
import com.patrick.xmlparser.domain.subscriberinfo.InsuranceInfo;

public class SubscriberInfo {

	private InsuranceInfo insuranceInfo;
	
	private EnrollmentInfo enrollmentInfo;
	
	private String role;
	
	private String personIndicator;
	
	private String lastName;
	
	private String firstName;
	
	private String middleName;
	
	private PrimaryIdentifier primaryIdentifier;
	
	
	private class PrimaryIdentifier{
		
		private String qualifier;
		
		private String identifier;
		
	}
	
}
