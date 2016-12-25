package com.mani.gayi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mani.gayi.model.Issue;


@Controller
public class IssueController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMyForm() {
		System.out.println("Hi i a m Hit");

		return "CreateIssueAlpha1";
	}

	
	@RequestMapping(value="/save")
	public String processForm(@ModelAttribute("issue") Issue issi){
		System.out.println("issi Name ::" +issi.getIssueSummary());
		System.out.println("issi ClientVersion::" +issi.getClientVersion());
		System.out.println("issi Client Code::" +issi.getClientCode());
		System.out.println("issi issueDescription::"+ issi.getIssueDescription());
		System.out.println("issi issueType::" +issi.getIssueType());
		System.out.println("issi issueSolution::" +issi.getIssueSolution());
				
		return "welcome";
	}
		
}
