package com.cicilthomas.aws.lambda.dto;

public class Bot {
	private String name;
	private String alias;
	private String version;
	private String outputDialogMode;
	
	public Bot() {}

	public Bot(String name, String alias, String version,String outputDialogMode) {
		super();
		this.name = name;
		this.alias = alias;
		this.version = version;
		this.outputDialogMode = outputDialogMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOutputDialogMode() {
		return outputDialogMode;
	}

	public void setOutputDialogMode(String outputDialogMode) {
		this.outputDialogMode = outputDialogMode;
	}
	
	
}
