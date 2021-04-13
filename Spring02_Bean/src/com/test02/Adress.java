package com.test02;

public class Adress {

	private String name;
	private String addr;
	private String phone;
	
	public Adress() {

	}
	
	public Adress(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Adress [name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
	
}
