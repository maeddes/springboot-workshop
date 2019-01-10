package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value=WorkshopDemoApplication.class,secure = false)
public class WorkshopDemoApplicationTests {

	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private Service service;
	
	@Test
	public void thingtest() throws Exception{
		
		String expectedString = "mercedes";
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/nicethings");
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		assertEquals(expectedString, result.getResponse().getContentAsString());
		
		
	}
	
	
	@Test
	public void contextLoads() {
	}
	
	
	

}

