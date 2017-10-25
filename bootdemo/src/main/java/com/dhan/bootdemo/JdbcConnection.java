package com.dhan.bootdemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode= ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	
	public JdbcConnection() {
		
		System.out.println("Database connection established");
		
	}
	
	
	public void postConstruct() {
		
		System.out.println("PostConstruct Method ");
	}
	
	
	public void preDestroy() {
		
		System.out.println("This is pre Destroy " );
	}

}
