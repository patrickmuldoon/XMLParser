package com.patrick.xmlparser.domain;

public class ClaimDates {
	
	private String dischargeHour;
	
	private ServiceDates serviceDates;
	
	private String admissionDate;
	
	private String admissionHour;
	
	
	private class ServiceDates{
		
		private String beginDate;
		
		private String endDate;
	}

}
