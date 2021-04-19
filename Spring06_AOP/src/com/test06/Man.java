package com.test06;

import org.springframework.stereotype.Component;

@Component
public class Man implements Student {

	@Override
	public void classwork() {
		// TODO Auto-generated method stub
		System.out.println("코인한다");

	}

}
