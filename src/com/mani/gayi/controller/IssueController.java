package com.mani.gayi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public String getMyForm() {
		return "CreateIssueAlpha1";
	}
	
	@RequestMapping(value = "/reportAnIssue", method = RequestMethod.GET)
	public String reportAnIssue()
	{
		return "CreateIssueAlpha1";
	}
	
	
	/*
	 * This is method will fetch the ajax requested values.
	 * */

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
	
	/*
	 * This is method called when we drag down the issue list.
	 * */

	@RequestMapping(value = "/getAJAXIssueList", method = RequestMethod.GET)
	public @ResponseBody List<Issue> getAJAXIssueList(HttpServletRequest request) {
		System.out.println("In the method call getAJAXIssueList");
		IssueDataTest issues = new IssueDataTest();
		List<Issue> resultList = issues.getIssueList40();
		int sindex = Integer.parseInt(request.getParameter("sindex"));
		int endindex = Integer.parseInt(request.getParameter("endindex"));
		System.out.println("sindex : "+sindex+" :: endindex : "+endindex);
		int size = resultList.size();
		System.out.println("Size is ............."+size);
		if(sindex>size)
		{
			return new ArrayList<>();
		}
		if(size>endindex)
		{
			return resultList.subList(sindex, endindex);
		}
		if(size<endindex)
		{
			return resultList.subList(sindex,size);
		}
		if(size==endindex)
		{
			return new ArrayList<>();
		}
		
		
		return issues.get33List();
	}

	
	/*
	 * This is method called when we select the search button on the Nav bar.
	 * */
	
	@RequestMapping(value = "/getIssues", method = RequestMethod.GET)
	public ModelAndView getIssues(HttpServletRequest request) {
		System.out.println("I getIssueList is called");
		HttpSession sessionobj = request.getSession();
		ModelAndView model = new ModelAndView("viewIssues");
		IssueDataTest issues = new IssueDataTest();
		int size=0;
		int maxsize = issues.getIssueList().size();
		if(maxsize>30)
		{
			size=30;
		}
		else
		{
			size=maxsize;
		}
		List<Issue> issueList = issues.getIssueList().subList(0, size);
		sessionobj.setAttribute("datafetched", size);
		model.addObject("listsofIssues", issueList);
		return model;
	}

}
