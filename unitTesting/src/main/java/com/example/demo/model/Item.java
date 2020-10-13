package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {
	
	@Id
	private Integer id;
	private String iname;
	private double price;
	private Integer quantity;
	
	@Transient
	private double value;
	
	
	
	public Item() {
		super();
	}

	public Item(Integer id, String iname, double price, Integer quantity) {
		super();
		this.id = id;
		this.iname = iname;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public String getIname() {
		return iname;
	}

	public double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Item[%d, %s, %d, %d]",id,iname,price,quantity);
	}
	
	
	

}
