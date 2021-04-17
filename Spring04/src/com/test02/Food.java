package com.test02;

public class Food {
	
	private String name;
	private int Price;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String name, int price) {
		super();
		this.name = name;
		Price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return name + " \t" + Price ;
	}
	
	
}
