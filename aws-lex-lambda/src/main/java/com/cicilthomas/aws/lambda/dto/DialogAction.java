package com.cicilthomas.aws.lambda.dto;

import java.util.Map;

public class DialogAction {
	
	private String type;
	private String fulfillmentState;
	private Message message;
	private String intentName;
	private String slotToElicit;
	private Map<String,String> slots;
	private ResponseCard responseCard;
	
	public DialogAction () {}
	
	public DialogAction(String type, String fulfillmentState, Message message,
			String intentName, String slotToElicit, Map<String, String> slots,
			ResponseCard responseCard) {
		super();
		this.type = type;
		this.fulfillmentState = fulfillmentState;
		this.message = message;
		this.intentName = intentName;
		this.slotToElicit = slotToElicit;
		this.slots = slots;
		this.responseCard = responseCard;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFulfillmentState() {
		return fulfillmentState;
	}
	public void setFulfillmentState(String fulfillmentState) {
		this.fulfillmentState = fulfillmentState;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public String getIntentName() {
		return intentName;
	}
	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}
	public String getSlotToElicit() {
		return slotToElicit;
	}
	public void setSlotToElicit(String slotToElicit) {
		this.slotToElicit = slotToElicit;
	}
	public Map<String, String> getSlots() {
		return slots;
	}
	public void setSlots(Map<String, String> slots) {
		this.slots = slots;
	}
	public ResponseCard getResponseCard() {
		return responseCard;
	}
	public void setResponseCard(ResponseCard responseCard) {
		this.responseCard = responseCard;
	}
	
}
