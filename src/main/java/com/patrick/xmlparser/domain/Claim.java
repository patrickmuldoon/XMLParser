package com.patrick.xmlparser.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient; 

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="echcf:claim")
public class Claim {
	
	@XmlElement(name="echcf:packaging")
	private Packaging packaging;
/*	
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
	
	private BillingProvider billingProvider;
*/
	public Claim(Packaging packaging/*, ClaimSubmitterInfo claimSubmitterInfo, ClaimReveiverInfo claimReceiverInfo,
			String internalClaimID, Classifications classifications, PatientInfo patientInfo,
			SubscriberInfo subscriberInfo, ClaimIdentificationInfo claimIdentificationInfo, ClaimDetails claimDetails,
			ClaimDates claimDates, ClaimAmounts claimAmounts, RelatedProvidersInfo relatedProvidersInfo,
			ClaimCOBInfo claimCOBInfo, ClaimPaymentInfo claimPaymentInfo, ServiceLineInfo serviceLineInfo,
			String submitterClaimID, BillingProvider billingProvider*/) {
		super();
		this.packaging = packaging;
/*		this.claimSubmitterInfo = claimSubmitterInfo;
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
		this.billingProvider = billingProvider;
*/	}

	public Claim() {
		super();
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

/*	@XmlElement(name="echcf:ClaimSubmitterInfo")
	public ClaimSubmitterInfo getClaimSubmitterInfo() {
		return claimSubmitterInfo;
	}

	public void setClaimSubmitterInfo(ClaimSubmitterInfo claimSubmitterInfo) {
		this.claimSubmitterInfo = claimSubmitterInfo;
	}

	@XmlElement(name="echcf:ClaimReceiverInfo")
	public ClaimReveiverInfo getClaimReceiverInfo() {
		return claimReceiverInfo;
	}

	public void setClaimReceiverInfo(ClaimReveiverInfo claimReceiverInfo) {
		this.claimReceiverInfo = claimReceiverInfo;
	}

	@XmlElement(name="echcf:InternalClaimID")
	public String getInternalClaimID() {
		return internalClaimID;
	}

	public void setInternalClaimID(String internalClaimID) {
		this.internalClaimID = internalClaimID;
	}

	@XmlElement(name="echcf:Classifications")
	public Classifications getClassifications() {
		return classifications;
	}

	public void setClassifications(Classifications classifications) {
		this.classifications = classifications;
	}

	@XmlElement(name="echcf:PatientInfo")
	public PatientInfo getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(PatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	@XmlElement(name="echcf:SubscriberInfo")
	public SubscriberInfo getSubscriberInfo() {
		return subscriberInfo;
	}

	public void setSubscriberInfo(SubscriberInfo subscriberInfo) {
		this.subscriberInfo = subscriberInfo;
	}

	@XmlElement(name="echcf:ClaimIdentificationInfo")
	public ClaimIdentificationInfo getClaimIdentificationInfo() {
		return claimIdentificationInfo;
	}

	public void setClaimIdentificationInfo(ClaimIdentificationInfo claimIdentificationInfo) {
		this.claimIdentificationInfo = claimIdentificationInfo;
	}

	@XmlElement(name="echcf:ClaimDetails")
	public ClaimDetails getClaimDetails() {
		return claimDetails;
	}

	public void setClaimDetails(ClaimDetails claimDetails) {
		this.claimDetails = claimDetails;
	}

	@XmlElement(name="echcf:ClaimDates")
	public ClaimDates getClaimDates() {
		return claimDates;
	}

	public void setClaimDates(ClaimDates claimDates) {
		this.claimDates = claimDates;
	}

	@XmlElement(name="echcf:ClaimAmounts")
	public ClaimAmounts getClaimAmounts() {
		return claimAmounts;
	}

	public void setClaimAmounts(ClaimAmounts claimAmounts) {
		this.claimAmounts = claimAmounts;
	}

	@XmlElement(name="echcf:RelatedProvidersInfo")
	public RelatedProvidersInfo getRelatedProvidersInfo() {
		return relatedProvidersInfo;
	}

	public void setRelatedProvidersInfo(RelatedProvidersInfo relatedProvidersInfo) {
		this.relatedProvidersInfo = relatedProvidersInfo;
	}

	@XmlElement(name="echcf:ClaimCOBInfo")
	public ClaimCOBInfo getClaimCOBInfo() {
		return claimCOBInfo;
	}

	public void setClaimCOBInfo(ClaimCOBInfo claimCOBInfo) {
		this.claimCOBInfo = claimCOBInfo;
	}

	@XmlElement(name="echcf:ClaimPaymentInfo")
	public ClaimPaymentInfo getClaimPaymentInfo() {
		return claimPaymentInfo;
	}

	public void setClaimPaymentInfo(ClaimPaymentInfo claimPaymentInfo) {
		this.claimPaymentInfo = claimPaymentInfo;
	}

	@XmlElement(name="echcf:ServiceLineInfo")
	public ServiceLineInfo getServiceLineInfo() {
		return serviceLineInfo;
	}

	public void setServiceLineInfo(ServiceLineInfo serviceLineInfo) {
		this.serviceLineInfo = serviceLineInfo;
	}

	@XmlElement(name="echcf:SubmitterClaimID")
	public String getSubmitterClaimID() {
		return submitterClaimID;
	}

	public void setSubmitterClaimID(String submitterClaimID) {
		this.submitterClaimID = submitterClaimID;
	}

	@XmlElement(name="echcf:BillingProvider")
	public BillingProvider getBillingProvider() {
		return billingProvider;
	}

	public void setBillingProvider(BillingProvider billingProvider) {
		this.billingProvider = billingProvider;
	}
*/	
}
