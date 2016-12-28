package com.mani.gayi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mani.gayi.model.AjaxResponseBody;
import com.mani.gayi.model.Issue;
import com.mani.gayi.test.IssueDataTest;

@Controller
public class IssueController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getMyForm(HttpServletRequest request) {
		System.out.println("I getIssueList is called");
		 HttpSession sessionobj = request.getSession();
		ModelAndView model = new ModelAndView("viewIssues");
		IssueDataTest issues = new IssueDataTest();
		List<Issue> issueList = issues.getIssueList();
		sessionobj.setAttribute("datafetched", issueList.size());
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

	@RequestMapping(value = "/getAJAXIssueList", method = RequestMethod.POST)
	public @ResponseBody List<Issue> getAJAXIssueList(@RequestParam int startindex,@RequestParam int endindex,HttpServletRequest request) {
		System.out.println(" startindex "+startindex+" end index "+endindex);
		IssueDataTest issues = new IssueDataTest();
		List<Issue> issueList = issues.getIssueList(startindex,endindex);
		return issueList;
	}
	
	@RequestMapping(value = "/getIssues", method = RequestMethod.POST)
	public @ResponseBody List<Issue> getIssueList(HttpServletRequest request) {
		System.out.println("I getIssueList is called");
		 HttpSession sessionobj = request.getSession();
		 
		 System.out.println("Request Value is "+request.getAttribute("indexone"));
		IssueDataTest issues = new IssueDataTest();
		List<Issue> issueList = issues.getIssueList();
		sessionobj.setAttribute("datafetched", issueList.size());
		return issueList;
	}

}
