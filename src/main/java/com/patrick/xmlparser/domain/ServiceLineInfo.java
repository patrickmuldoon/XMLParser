package com.patrick.xmlparser.domain;

import com.patrick.xmlparser.domain.servicelineinfo.DrugInfo;
import com.patrick.xmlparser.domain.servicelineinfo.OtherPayerProcessedInfo;
import com.patrick.xmlparser.domain.servicelineinfo.ServiceInfo;
import com.patrick.xmlparser.domain.servicelineinfo.ServicePaymentHistory;
import com.patrick.xmlparser.domain.servicelineinfo.ServiceRelatedDates;

public class ServiceLineInfo {

	private String dischargeDate;
	
	private String statementFromDate;
	
	private String statementToDate;
	
	private String admitDate;
	
	private String admitTime;
	
	private String assignedNumber;
	
	private String lineCounter;
	
	private ServiceInfo serviceInfo;
	
	private ServicePaymentHistory servicePaymentHistory;
	
	private ServiceRelatedDates serviceRelatedDates;
	
	private DrugInfo drugInfo;
	
	private OtherPayerProcessedInfo otherPayerProcessedInfo;
	
	
	
	
}
