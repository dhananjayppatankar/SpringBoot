package com.dhan.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
	
	@Autowired
	private JdbcConnection jdbcconnection;

	public JdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(JdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}
	
	public void postConstruct() {
		
		System.out.println("This is post Construct !!");
	}
	
	public void preDestroy() {
		
		System.out.println("Pre Destroy ");
		
	}
	
	
	
}
