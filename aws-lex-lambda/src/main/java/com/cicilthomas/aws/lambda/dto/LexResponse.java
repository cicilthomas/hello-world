package com.cicilthomas.aws.lambda.dto;

import java.util.Map;

public class LexResponse {
	
	private Map<String,Object> sessionAttributes;	
	private DialogAction dialogAction;	
	
	public LexResponse() {}	

	public LexResponse(Map<String, Object> sessionAttributes,DialogAction dialogAction) {
		super();
		this.sessionAttributes = sessionAttributes;
		this.dialogAction = dialogAction;
	}

	public Map<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}

	public void setSessionAttributes(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}

	public DialogAction getDialogAction() {
		return dialogAction;
	}

	public void setDialogAction(DialogAction dialogAction) {
		this.dialogAction = dialogAction;
	}	

}
