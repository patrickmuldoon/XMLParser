package com.patrick.xmlparser.domain;

import com.patrick.xmlparser.domain.claimcobinfo.OtherPayerAdjudicationInfo;
import com.patrick.xmlparser.domain.claimcobinfo.OtherSubscriberInfo;

public class ClaimCOBInfo {

	private String cobLoopType;
	
	private OtherSubscriberInfo otherSubscriberInfo;
	
	private OtherPayerAdjudicationInfo otherPayerAdjudicationInfo;
	
	private String claimCOBPayerID;
	
	private String adjudicationOrPaymentDate;
	
}
