package com.example.demo.business;

import java.util.List;

import com.example.demo.model.Item;

public interface ItemBusinessService {
	
	public Item getDataFromBusinessService();
	
	public List<Item> getAllItemsFromH2();

}
