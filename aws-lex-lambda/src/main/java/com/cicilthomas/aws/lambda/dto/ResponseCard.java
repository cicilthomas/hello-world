package com.cicilthomas.aws.lambda.dto;

public class ResponseCard {
	
	private int version;
	private String contentType;
	
	public ResponseCard() {}
	
	public ResponseCard(int version, String contentType) {
		super();
		this.version = version;
		this.contentType = contentType;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	

}
