package com.mani.gayi.model;

import java.io.Serializable;

public class Issue implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7082913917873974374L;
	private int issueId;
	private String issueSummary;
	private String clientCode;
	private int clientVersion;
	private String issueDescription;
	private String issueSolution;
	private String issueType;
	
	
	
	public Issue() {
		super();
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public String getIssueSummary() {
		return issueSummary;
	}

	public void setIssueSummary(String issueSummary) {
		this.issueSummary = issueSummary;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public int getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(int clientVersion) {
		if (clientVersion > 1999 && clientVersion < 3000) {
			this.clientVersion = clientVersion;
		} else {
			this.clientVersion = 0;
		}

	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	public String getIssueSolution() {
		return issueSolution;
	}

	public void setIssueSolution(String issueSolution) {
		this.issueSolution = issueSolution;
	}

	public Issue(int issueId, String issueSummary, String clientCode, int clientVersion, String issueDescription,
			String issueSolution, String issueType) {
		super();
		this.issueId = issueId;
		this.issueSummary = issueSummary;
		this.clientCode = clientCode;
		this.clientVersion = clientVersion;
		this.issueDescription = issueDescription;
		this.issueSolution = issueSolution;
		this.issueType = issueType;
	}


}
