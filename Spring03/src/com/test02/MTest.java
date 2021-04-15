package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		EMP lee = (EMP) factory.getBean("lee");
		EMP hong = (EMP) factory.getBean("hong",EMP.class);
		
		System.out.println(lee);
		System.out.println(hong);
	}
}
