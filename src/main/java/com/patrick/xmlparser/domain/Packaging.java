package com.patrick.xmlparser.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Packaging {

	private String transmissionFileName;
	
	private String transmissionID;
	
	private String senderID;
	
	private String receiverID;
	
	private String OriginatorID;
	
	private String contractID;
	
	private String destinationID;
	
	private String regionCode;

	public Packaging(String transmissionFileName, String transmissionID, String senderID, String receiverID,
			String originatorID, String contractID, String destinationID, String regionCode) {
		super();
		this.transmissionFileName = transmissionFileName;
		this.transmissionID = transmissionID;
		this.senderID = senderID;
		this.receiverID = receiverID;
		OriginatorID = originatorID;
		this.contractID = contractID;
		this.destinationID = destinationID;
		this.regionCode = regionCode;
	}

	public Packaging() {
		super();
	}

	
	public String getTransmissionFileName() {
		return transmissionFileName;
	}

	public void setTransmissionFileName(String transmissionFileName) {
		this.transmissionFileName = transmissionFileName;
	}

	public String getTransmissionID() {
		return transmissionID;
	}

	public void setTransmissionID(String transmissionID) {
		this.transmissionID = transmissionID;
	}

	public String getSenderID() {
		return senderID;
	}

	public void setSenderID(String senderID) {
		this.senderID = senderID;
	}

	public String getReceiverID() {
		return receiverID;
	}

	public void setReceiverID(String receiverID) {
		this.receiverID = receiverID;
	}

	public String getOriginatorID() {
		return OriginatorID;
	}

	public void setOriginatorID(String originatorID) {
		OriginatorID = originatorID;
	}

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getDestinationID() {
		return destinationID;
	}

	public void setDestinationID(String destinationID) {
		this.destinationID = destinationID;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	@Override
	public String toString() {
		return "Packaging [transmissionFileName=" + transmissionFileName + ", transmissionID=" + transmissionID
				+ ", senderID=" + senderID + ", receiverID=" + receiverID + ", OriginatorID=" + OriginatorID
				+ ", contractID=" + contractID + ", destinationID=" + destinationID + ", regionCode=" + regionCode
				+ "]";
	}
	
	
	
}
