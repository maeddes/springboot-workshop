package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@org.springframework.stereotype.Service
public class Service {
	
	private Logger logger = LoggerFactory.getLogger(Service.class);
	
	public void logService() {
		logger.debug("Service message logged");
	}
	
	

}
