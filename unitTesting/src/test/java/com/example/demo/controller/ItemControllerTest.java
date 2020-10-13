package com.example.demo.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.business.ItemBusinessService;
import com.example.demo.model.Item;

@RunWith(SpringRunner.class)
@WebMvcTest(value=ItemController.class)
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@MockBean
	private ItemBusinessService itemBusinessService;
	
	@Test
	public void getItem_basic() throws Exception
	{
		RequestBuilder request=MockMvcRequestBuilders
				.get("/items")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\": 1,\"iname\":\"ball\",\"price\":10.99,\"quantity\":5}"))
				.andReturn();
		
		//assertEquals("hello world",result.getResponse().getContentAsString());
		
		
	}
	
	@Test
	public void getItemfromBusinessService_basic() throws Exception
	{
		when(itemBusinessService.getDataFromBusinessService()).thenReturn(new Item(2,"ball",11.99,5));
		RequestBuilder request=MockMvcRequestBuilders
				.get("/itemsService")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\": 2,\"iname\":\"ball\",\"price\":11.99,\"quantity\":5}"))
				.andReturn();
		
		//assertEquals("hello world",result.getResponse().getContentAsString());
		
		
	}

}
