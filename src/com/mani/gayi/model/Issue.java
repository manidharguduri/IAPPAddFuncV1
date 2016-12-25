package com.mani.gayi.model;

public class Issue {

	private int issueId;
	private String issueSummary;
	private String clientCode;
	private int clientVersion;
	private String issueDescription;
	private String issueSolution;
	private String issueType;
	
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

}
