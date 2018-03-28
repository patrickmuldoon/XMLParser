package com.patrick.xmlparser.domain.servicelineinfo.serviceinfo;

import java.util.List;

public class ServiceCodeInfo {

	private String qualifier;
	
	private String value;
	
	private List<ModifierInfo> modifierInfo;
	
	
	private class ModifierInfo{
		
		private String modifierCode;
		
	}
	
}
