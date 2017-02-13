package com.cicilthomas.aws.lambda.dto;

public class Message {
	private String contentType;
	private String content;
	
	public Message () {}
	
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message(String contentType, String content) {
		super();
		this.contentType = contentType;
		this.content = content;
	}
	
	
}
