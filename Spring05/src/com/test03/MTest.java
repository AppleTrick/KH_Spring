package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		TV samsong = factory.getBean("samsong",TV.class);
		
		
		samsong.powerOn();
		samsong.volumUp();
		samsong.volumDown();
		samsong.powerOff();
		
		TV ig = (TV) factory.getBean("igTV");
		ig.powerOn();
		ig.volumUp();
		ig.volumDown();
		ig.powerOff();
		
	}
}
