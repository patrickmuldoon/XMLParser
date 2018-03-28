package com.patrick.xmlparser.domain.servicelineinfo.otherpayerprocessedinfo;

import java.util.List;

public class ProcessedServiceCodeInfo {

	private String qualifier;
	
	private String value;
	
	private List<ModifierInfo> modifierInfo;
	
	
	
	private class ModifierInfo{
		
		private String modifierCode;
		
	}
	
}
