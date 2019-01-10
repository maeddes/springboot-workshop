package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class WorkshopDemoApplication {
	
	Logger logger = LoggerFactory.getLogger(WorkshopDemoApplication.class);
	
	@Value("${spring.application.name: Fallback}")
	String env;
	
	@Value("${config.property: 123}")
	int configValue;
	
	@Autowired
	private Service service;
	
	@GetMapping("/test")
	String getName() {
		
		logger.info("getName called while env was {}", env);
		service.logService();
		return this.env;
		
	}
	
	@GetMapping("/validateConfigServer")
	int getValue() {
		
		return configValue;
	}
	
	@GetMapping("/hello")
	String sayHello() {
		
		return "Hallo, Ehningen!";
	}
	
	
	@GetMapping("/nicethings")
	public String niceThings() {
		
		return "mercedes";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(WorkshopDemoApplication.class, args);
	}

}

