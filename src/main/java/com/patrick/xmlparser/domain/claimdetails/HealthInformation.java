package com.patrick.xmlparser.domain.claimdetails;

import java.util.List;

import com.patrick.xmlparser.domain.claimdetails.healthinformation.AdmittingDiagnosis;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.ExternalCauseOfInjury;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.OtherDiagnosis;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.PatientsReasonForVisit;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.PrincipalDiagnosis;

public class HealthInformation {

	private PrincipalDiagnosis principalDiagnosis;
	
	private AdmittingDiagnosis admittingDiagnosis;
	
	private List<PatientsReasonForVisit> patientsReasonForVisit;
	
	private List<ExternalCauseOfInjury> externalCauseOfInjury;
	
	private String diagnosisRelatedGroup;
	
	private List<OtherDiagnosis> otherDiagnosis;
	
}
