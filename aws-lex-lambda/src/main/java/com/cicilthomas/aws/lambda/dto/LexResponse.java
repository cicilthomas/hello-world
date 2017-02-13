package com.cicilthomas.aws.lambda.dto;

import java.util.Map;

public class LexResponse {
	
	private Map<String,String> sessionAttributes;	
	private DialogAction dialogAction;	
	
	public LexResponse() {}	

	public LexResponse(Map<String, String> sessionAttributes,DialogAction dialogAction) {
		super();
		this.sessionAttributes = sessionAttributes;
		this.dialogAction = dialogAction;
	}

	public Map<String, String> getSessionAttributes() {
		return sessionAttributes;
	}

	public void setSessionAttributes(Map<String, String> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}

	public DialogAction getDialogAction() {
		return dialogAction;
	}

	public void setDialogAction(DialogAction dialogAction) {
		this.dialogAction = dialogAction;
	}	

}
