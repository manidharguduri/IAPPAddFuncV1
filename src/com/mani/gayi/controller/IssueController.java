package com.mani.gayi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mani.gayi.model.AjaxResponseBody;
import com.mani.gayi.model.Issue;

@Controller
public class IssueController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMyForm() {
		System.out.println("Hi i a m Hit");

		return "CreateIssueAlpha1";
	}

	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public AjaxResponseBody processForm(@RequestBody Issue jsonData) {

		System.out.println("issi Name ::" + jsonData.getIssueSummary());
		System.out.println("issi ClientVersion::" + jsonData.getClientVersion());
		System.out.println("issi Client Code::" + jsonData.getClientCode());
		System.out.println("issi issueDescription::" + jsonData.getIssueDescription());
		System.out.println("issi issueType::" + jsonData.getIssueType());
		System.out.println("issi issueSolution::" + jsonData.getIssueSolution());

		AjaxResponseBody result = new AjaxResponseBody();

		result.setMsg("Ur Issue has been saved...");
		return result;

	}

	@RequestMapping(value = "/getIssues", method = RequestMethod.GET)
	public @ResponseBody List<Issue> getIssueList() {
		List<Issue> issues = new ArrayList<>();

		Issue i1 = new Issue();
		i1.setIssueId(65);
		i1.setClientCode("USEI");
		issues.add(i1);

		Issue i2 = new Issue();
		i2.setIssueId(67);
		i2.setClientCode("fjg");
		issues.add(i2);

		Issue i3 = new Issue();
		i3.setIssueId(69);
		i3.setClientCode("kjjhj");
		issues.add(i3);

		Issue i4 = new Issue();
		i4.setIssueId(60);
		i4.setClientCode("jgjhmg");
		issues.add(i4);

		return issues;
	}

}
