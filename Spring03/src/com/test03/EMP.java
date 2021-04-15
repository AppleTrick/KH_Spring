package com.test03;

public class EMP {
	
	private String name;
	private int salary;
	
	public EMP() {
	}

	public EMP(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EMP [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
