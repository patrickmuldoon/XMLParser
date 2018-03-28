package com.patrick.xmlparser.domain.claimcobinfo;

import com.patrick.xmlparser.domain.claimcobinfo.othersubscriberinfo.AddressInfo;
import com.patrick.xmlparser.domain.claimcobinfo.othersubscriberinfo.EnrollmentInfo;
import com.patrick.xmlparser.domain.claimcobinfo.othersubscriberinfo.InsuranceInfo;
import com.patrick.xmlparser.domain.claimcobinfo.othersubscriberinfo.PrimaryIdentifier;

public class OtherSubscriberInfo {

	private InsuranceInfo insuranceInfo;
	
	private EnrollmentInfo enrollmentInfo;
	
	private String role;
	
	private String personIndicator;
	
	private String lastName;
	
	private String firstName;
	
	private String middleName;
	
	private PrimaryIdentifier primaryIdentifier;
	
	private AddressInfo addressInfo;
	
}
