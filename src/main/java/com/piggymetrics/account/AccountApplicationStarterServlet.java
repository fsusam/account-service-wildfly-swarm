package com.piggymetrics.account;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@Component
public class AccountApplicationStarterServlet extends SpringBootServletInitializer {

	private final static Log logging = LogFactory.getLog(AccountApplicationStarterServlet.class);
	
	@PostConstruct
    public void postConstructInit(){

		logging.info("AccountApplicationStarterServlet started...");
		
    }
}
