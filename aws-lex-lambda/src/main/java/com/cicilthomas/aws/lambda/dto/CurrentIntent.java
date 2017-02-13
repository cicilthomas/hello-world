package com.cicilthomas.aws.lambda.dto;

import java.util.Map;

public class CurrentIntent {
	
	private String name;	
	private Map<String,String> slots;

	public CurrentIntent() {}
	
	public CurrentIntent(String name, Map<String, String> slots) {
		super();
		this.name = name;
		this.slots = slots;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getSlots() {
		return slots;
	}

	public void setSlots(Map<String, String> slots) {
		this.slots = slots;
	}
	
}
