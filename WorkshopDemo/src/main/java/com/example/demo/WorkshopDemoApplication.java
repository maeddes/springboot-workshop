package com.example.demo;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkshopDemoApplication {
	
	Logger logger = LoggerFactory.getLogger(WorkshopDemoApplication.class);
	
	@Value("${spring.application.name: Fallback}")
	String env;
	
	@Autowired
	private Service service;
	
	@GetMapping("/test")
	String getName() {
		logger.info("getName called while env was {}", env);
		service.logService();
		return this.env;
		
	}
	
	@GetMapping("/hello")
	String sayHello() {
		
		return "Hallo, Ehningen!";
	}
	
	ArrayList<String> things = new ArrayList<String>();
	
	@PostMapping("/{thing}")
	void addThing(@PathVariable String thing) {
		
		things.add(thing);
		
	}
	
	@DeleteMapping("/{thing}")
	void deleteThing(@PathVariable String thing) {
		
		things.remove(thing);
	}

	@GetMapping
	String getThings() {
		
		return things.toString();
		
	}
	
	@GetMapping("/nicethings")
	public String niceThings() {
		return "mercedes";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(WorkshopDemoApplication.class, args);
	}

}

