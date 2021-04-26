package com.hello.mvc.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mvc.dao.HelloDao;

@Service
public class HelloBiz {
	
	
	//TODO : 06.Dao(@Repository 호출)
	@Autowired
	private HelloDao dao;
	
	//TODO : 08. biz에서 return
	public String getHello() {
		return "Hello, " + dao.getHello();
	}
	
}
