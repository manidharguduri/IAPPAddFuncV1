package com.mani.gayi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mani.gayi.model.AjaxResponseBody;
import com.mani.gayi.model.Issue;
import com.mani.gayi.test.IssueDataTest;

@Controller
public class IssueController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getMyForm() {
		System.out.println("Hi i a m Hit");

		ModelAndView model = new ModelAndView("viewIssues");

		IssueDataTest issues = new IssueDataTest();
		List<Issue> issueList = issues.getIssueList();

		model.addObject("listsofIssues", issueList);
		return model;
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

	@RequestMapping(value = "/getIssues", method = RequestMethod.POST)
	public @ResponseBody List<Issue> getIssueList() {
		System.out.println("hello");
		IssueDataTest issues = new IssueDataTest();
		List<Issue> issueList = issues.getIssueList();
		return issueList;
	}

}
