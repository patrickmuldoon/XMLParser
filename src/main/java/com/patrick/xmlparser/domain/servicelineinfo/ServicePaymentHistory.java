package com.patrick.xmlparser.domain.servicelineinfo;

import java.util.List;

import com.patrick.xmlparser.domain.servicelineinfo.servicepaymenthistory.ProcessedServiceInfo;

public class ServicePaymentHistory {

	private String lineChargeAmount;
	
	private String linePaidAmount;
	
	private ProcessedServiceInfo processServiceInfo;
	
	private String processedQuantity;
	
	private List<ServiceAdjustment> serviceAdjustment;
	
	private String paymentOrAdjudicationDate;
	
	private String paymentIssuesDate;
	
	
	private class ServiceAdjustment{
		
		private String groupCode;
		
		private String reasonCode;
		
		private String amount;
		
		private String quantity;
		
		
	}
	
}
