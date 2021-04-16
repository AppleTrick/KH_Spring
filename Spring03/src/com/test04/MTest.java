package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		Developer lee = factory.getBean("lee-ss",Developer.class);
		Egineer hong = (Egineer) factory.getBean("hong-gd");
		
		System.out.println(lee);
		System.out.println(hong);
	}
}
