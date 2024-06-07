package com.saipent.asde.service;

public class Car {
	private String name;
	private String maker;
	private double price;
	
	

	public Car(String name, String maker, double price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMaker() {
		return maker;
	}



	public void setMaker(String maker) {
		this.maker = maker;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
    
}
