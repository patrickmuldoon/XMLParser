package com.patrick.xmlparser.domain;

public class Claim {
	
	private Packaging packaging;
	
	private ClaimSubmitterInfo claimSubmitterInfo;
	
	private ClaimReveiverInfo claimReceiverInfo;
	
	private String internalClaimID;
	
	private Classifications classifications;
	
	private PatientInfo patientInfo;
	
	private SubscriberInfo subscriberInfo;
	
	private ClaimIdentificationInfo claimIdentificationInfo;
	
	private ClaimDetails claimDetails;
	
	private ClaimDates claimDates;
	
	private ClaimAmounts claimAmounts;
	
	private RelatedProvidersInfo relatedProvidersInfo;
	
	private ClaimCOBInfo claimCOBInfo;
	
	private ClaimPaymentInfo claimPaymentInfo;
	
	private ServiceLineInfo serviceLineInfo;
	
	private String submitterClaimID;

	public Claim(Packaging packaging, ClaimSubmitterInfo claimSubmitterInfo, ClaimReveiverInfo claimReceiverInfo,
			String internalClaimID, Classifications classifications, PatientInfo patientInfo,
			SubscriberInfo subscriberInfo, ClaimIdentificationInfo claimIdentificationInfo, ClaimDetails claimDetails,
			ClaimDates claimDates, ClaimAmounts claimAmounts, RelatedProvidersInfo relatedProvidersInfo,
			ClaimCOBInfo claimCOBInfo, ClaimPaymentInfo claimPaymentInfo, ServiceLineInfo serviceLineInfo,
			String submitterClaimID) {
		super();
		this.packaging = packaging;
		this.claimSubmitterInfo = claimSubmitterInfo;
		this.claimReceiverInfo = claimReceiverInfo;
		this.internalClaimID = internalClaimID;
		this.classifications = classifications;
		this.patientInfo = patientInfo;
		this.subscriberInfo = subscriberInfo;
		this.claimIdentificationInfo = claimIdentificationInfo;
		this.claimDetails = claimDetails;
		this.claimDates = claimDates;
		this.claimAmounts = claimAmounts;
		this.relatedProvidersInfo = relatedProvidersInfo;
		this.claimCOBInfo = claimCOBInfo;
		this.claimPaymentInfo = claimPaymentInfo;
		this.serviceLineInfo = serviceLineInfo;
		this.submitterClaimID = submitterClaimID;
	}

	public Claim() {
		super();
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

	public ClaimSubmitterInfo getClaimSubmitterInfo() {
		return claimSubmitterInfo;
	}

	public void setClaimSubmitterInfo(ClaimSubmitterInfo claimSubmitterInfo) {
		this.claimSubmitterInfo = claimSubmitterInfo;
	}

	public ClaimReveiverInfo getClaimReceiverInfo() {
		return claimReceiverInfo;
	}

	public void setClaimReceiverInfo(ClaimReveiverInfo claimReceiverInfo) {
		this.claimReceiverInfo = claimReceiverInfo;
	}

	public String getInternalClaimID() {
		return internalClaimID;
	}

	public void setInternalClaimID(String internalClaimID) {
		this.internalClaimID = internalClaimID;
	}

	public Classifications getClassifications() {
		return classifications;
	}

	public void setClassifications(Classifications classifications) {
		this.classifications = classifications;
	}

	public PatientInfo getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(PatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public SubscriberInfo getSubscriberInfo() {
		return subscriberInfo;
	}

	public void setSubscriberInfo(SubscriberInfo subscriberInfo) {
		this.subscriberInfo = subscriberInfo;
	}

	public ClaimIdentificationInfo getClaimIdentificationInfo() {
		return claimIdentificationInfo;
	}

	public void setClaimIdentificationInfo(ClaimIdentificationInfo claimIdentificationInfo) {
		this.claimIdentificationInfo = claimIdentificationInfo;
	}

	public ClaimDetails getClaimDetails() {
		return claimDetails;
	}

	public void setClaimDetails(ClaimDetails claimDetails) {
		this.claimDetails = claimDetails;
	}

	public ClaimDates getClaimDates() {
		return claimDates;
	}

	public void setClaimDates(ClaimDates claimDates) {
		this.claimDates = claimDates;
	}

	public ClaimAmounts getClaimAmounts() {
		return claimAmounts;
	}

	public void setClaimAmounts(ClaimAmounts claimAmounts) {
		this.claimAmounts = claimAmounts;
	}

	public RelatedProvidersInfo getRelatedProvidersInfo() {
		return relatedProvidersInfo;
	}

	public void setRelatedProvidersInfo(RelatedProvidersInfo relatedProvidersInfo) {
		this.relatedProvidersInfo = relatedProvidersInfo;
	}

	public ClaimCOBInfo getClaimCOBInfo() {
		return claimCOBInfo;
	}

	public void setClaimCOBInfo(ClaimCOBInfo claimCOBInfo) {
		this.claimCOBInfo = claimCOBInfo;
	}

	public ClaimPaymentInfo getClaimPaymentInfo() {
		return claimPaymentInfo;
	}

	public void setClaimPaymentInfo(ClaimPaymentInfo claimPaymentInfo) {
		this.claimPaymentInfo = claimPaymentInfo;
	}

	public ServiceLineInfo getServiceLineInfo() {
		return serviceLineInfo;
	}

	public void setServiceLineInfo(ServiceLineInfo serviceLineInfo) {
		this.serviceLineInfo = serviceLineInfo;
	}

	public String getSubmitterClaimID() {
		return submitterClaimID;
	}

	public void setSubmitterClaimID(String submitterClaimID) {
		this.submitterClaimID = submitterClaimID;
	}
	
}
