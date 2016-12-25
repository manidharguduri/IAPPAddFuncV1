package com.mani.gayi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mani.gayi.model.Issue;



public class IssueDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveIssue(Issue iss) {
//		System.out.println("Entering IssueDao::saveIssue::"+iss.getIssueName());
//		String query = "insert into issue values('" + iss.getIssueId()+"','"+iss.getIssueName() +"')";
//		System.out.println("The Query formed is"+query);
//		return jdbcTemplate.update(query);
		return 0;
	}
}
