package com.test04;

public class Man implements Student {

	@Override
	public String classWork() {
		System.out.println("뉴스본다");
		// 에러발생
		/*
		 * String t = null;
		 * 
		 * t.length();
		 */
		return "스프링 연습";
	}

}
