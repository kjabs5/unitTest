package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.ItemBusinessService;
import com.example.demo.model.Item;

@RestController				
public class ItemController {
	
	@Autowired
	private ItemBusinessService itemBusinessService;
	
	@GetMapping("/items")
	public Item getItem()
	{
		return new Item(1,"ball",10.99,5);
	}
	
	@GetMapping("/itemsService")
	public Item getItemService()
	{
		return itemBusinessService.getDataFromBusinessService();
	}
	
	@GetMapping("/itemsDb")
	public List<Item> getItemsDb()
	{   
		List<Item> items=itemBusinessService.getAllItemsFromH2();
		return items;
	}

}
