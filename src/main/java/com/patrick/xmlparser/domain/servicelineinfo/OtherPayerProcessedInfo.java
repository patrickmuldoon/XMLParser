package com.patrick.xmlparser.domain.servicelineinfo;

import com.patrick.xmlparser.domain.servicelineinfo.otherpayerprocessedinfo.ProcessedServiceCodeInfo;

public class OtherPayerProcessedInfo {

	private String otherLoopType;
	
	private String processedPayerID;
	
	private String linePaidAmount;
	
	private ProcessedServiceCodeInfo processedServiceCodeInfo;
	
	private String revenueCode;
	
	private String processedQuantity;
	
	private ServiceAdjustment serviceAdjustment;
	
	//look into this one record 432 row 27
	private String medicareCoPaymentAmount;
	
	//look into this one record 432 row 31
	private String medicareDeductibleAmount;
	
	//look into this one record 432 row 34
	private String medicareCoInsuranceAmount;
	
	private String paymentOrAdjudicationDate;
	
	private String otherInsuranceCoPayAmount;
	
	private String otherInsuranceDeductibleAmount;
	
	private String otherInsuranceCoInsuranceAmount;
	
	
	private class ServiceAdjustment{
		
		private String groupCode;
		
		private String reasonCode;
		
		private String amount;
		
		private String quantity;
		
	}
	
}
