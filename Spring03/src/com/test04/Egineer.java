package com.test04;

public class Egineer {
	
	private Emp emp;
	private String dept;
	
	public Egineer() {

	}

	public Egineer(Emp emp, String dept) {
		this.emp = emp;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp + "\t 부서 : " + dept;
	}	
}
