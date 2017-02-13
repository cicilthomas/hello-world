package com.cicilthomas.aws.lambda.dto;

import java.util.Map;

public class LexRequest {
	private String messageVersion;
	private String invocationSource;
	private String userId;
	private Map<String,String> sessionAttributes;
	private Bot bot;
	private CurrentIntent currentIntent;

	public LexRequest() {}
	
	public LexRequest(String messageVersion, String invocationSource,
			String userId, Map<String, String> sessionAttributes, Bot bot,
			CurrentIntent currentIntent) {
		super();
		this.messageVersion = messageVersion;
		this.invocationSource = invocationSource;
		this.userId = userId;
		this.sessionAttributes = sessionAttributes;
		this.bot = bot;
		this.currentIntent = currentIntent;
	}
	
	public String getMessageVersion() {
		return messageVersion;
	}
	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
	public String getInvocationSource() {
		return invocationSource;
	}
	public void setInvocationSource(String invocationSource) {
		this.invocationSource = invocationSource;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Map<String, String> getSessionAttributes() {
		return sessionAttributes;
	}
	public void setSessionAttributes(Map<String, String> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
	public Bot getBot() {
		return bot;
	}
	public void setBot(Bot bot) {
		this.bot = bot;
	}
	public CurrentIntent getCurrentIntent() {
		return currentIntent;
	}
	public void setCurrentIntent(CurrentIntent currentIntent) {
		this.currentIntent = currentIntent;
	}
	
}

