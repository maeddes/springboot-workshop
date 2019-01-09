package com.example.demo;

import java.util.ArrayList;

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
	
	public static void main(String[] args) {
		SpringApplication.run(WorkshopDemoApplication.class, args);
	}

}

