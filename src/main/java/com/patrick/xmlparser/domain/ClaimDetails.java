package com.patrick.xmlparser.domain;

import com.patrick.xmlparser.domain.claimdetails.HealthInformation;

public class ClaimDetails {

	private String admissionType;
	
	private String admissionSource;
	
	private ClaimContractInfo claimContractInfo;
	
	private String priorAuthorizationNumber;
	
	private HealthInformation healthInformation;
	
	private class ClaimContractInfo{
		
		private String ContractTypeCode;
		
		private String contractAmount;
		
		private String contractCode;
	}
	
}
