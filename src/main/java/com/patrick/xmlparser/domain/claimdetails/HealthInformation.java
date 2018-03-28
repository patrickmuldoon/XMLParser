package com.patrick.xmlparser.domain.claimdetails;

import java.util.List;

import com.patrick.xmlparser.domain.claimdetails.healthinformation.AdmittingDiagnosis;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.ExternalCauseOfInjury;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.OccurenceSpan;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.OtherDiagnosis;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.OtherProcedure;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.PatientsReasonForVisit;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.PrincipalDiagnosis;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.PrincipalProcedure;
import com.patrick.xmlparser.domain.claimdetails.healthinformation.Value;

public class HealthInformation {

	private PrincipalDiagnosis principalDiagnosis;
	
	private AdmittingDiagnosis admittingDiagnosis;
	
	private List<PatientsReasonForVisit> patientsReasonForVisit;
	
	private List<ExternalCauseOfInjury> externalCauseOfInjury;
	
	private String diagnosisRelatedGroup;
	
	private List<OtherDiagnosis> otherDiagnosis;
	
	private PrincipalProcedure principalProcedure;
	
	private List<OtherProcedure> otherProcedure;
	
	private List<OccurenceSpan> occurenceSpan;
	
	private List<Value> value;
	
	
}
