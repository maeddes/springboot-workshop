package com.example.demo;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TodoList {
	
	Logger logger = LoggerFactory.getLogger(TodoList.class);
	
	List<String> things = new ArrayList<String>();
	
	@PostMapping("/todos/{thing}")
	void addThing(@PathVariable String thing) {
		
		logger.info("adding thing {}",thing);
		things.add(thing);
		
	}
	
	@DeleteMapping("/todos/{thing}")
	void deleteThing(@PathVariable String thing) {
		
		logger.info("delete thing {}",thing);
		things.remove(thing);
	}

	@GetMapping("/todos")
	List<String> getThings() {
		
		logger.debug("getting things {}",things);
		return things;
		
	}

}


