package com.test06;

public class BeanFactory {
	
	public Object getBean(String beanName) {
		if (beanName.equals("samsong")) {
			return new SamsongTV();
		}else if(beanName.equals("lz")) {
			return new LZTV();
		}
		
		return null;
	}
}
