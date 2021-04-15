package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		EMP hong =  (EMP) factory.getBean("hong");
		EMP lee = factory.getBean("lee",EMP.class);
		
		System.out.println(hong);
		System.out.println(lee);
	}
}
