package com.mani.gayi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String processForm(@RequestBody Issue jsonData){
		
		
		System.out.println("issi Name ::" +jsonData.getIssueSummary());
		System.out.println("issi ClientVersion::" +jsonData.getClientVersion());
		System.out.println("issi Client Code::" +jsonData.getClientCode());
		System.out.println("issi issueDescription::"+ jsonData.getIssueDescription());
		System.out.println("issi issueType::" +jsonData.getIssueType());
		System.out.println("issi issueSolution::" +jsonData.getIssueSolution());
				
		return "welcome";
	}
		
}
