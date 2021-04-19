package com.test07;

public class MessageBeanImpl implements MessageBean {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		try {
			// 2초동안 thread 중단
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Hello " + name);
	}

}
