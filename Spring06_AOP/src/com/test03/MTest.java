package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		
		Student w = factory.getBean("woman",Student.class);
		Student m = factory.getBean("man",Student.class);
		
		System.out.println("남학생 입장");
		m.classWork();
		System.out.println("-0--");
		System.out.println("여학생 입장");
		w.classWork();
	}
}
