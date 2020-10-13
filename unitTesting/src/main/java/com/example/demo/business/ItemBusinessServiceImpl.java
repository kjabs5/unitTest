package com.example.demo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;

@Service
public class ItemBusinessServiceImpl implements ItemBusinessService {

	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item getDataFromBusinessService() {
		// TODO Auto-generated method stub
		return new Item(1,"ball",10.98,5);
	}

	@Override
	public List<Item> getAllItemsFromH2() {
		// TODO Auto-generated method stub
		List<Item> items=itemRepository.findAll();
		
		for(Item item:items)
		{
			item.setValue(item.getPrice()*item.getQuantity());
		}
		
		return items;
	}
	
	

}
