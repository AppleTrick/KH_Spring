package com.test01;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BeanTest {
	private MyClass myclass;
	
	public BeanTest() {
		// TODO Auto-generated constructor stub
		System.out.println("BeanTest 기본 생성자");
	}
	
	public BeanTest(MyClass myclass) {
		this.myclass = myclass;
		System.out.println("BeanTest(MyClass) 생성자!");
	}
	
	public BeanTest(Date date) {
		System.out.println("BeanTest(Date) 생성자!");
		System.out.println(date.toLocaleString());
	}
	
	// setter
	public void setMyclass(MyClass myclass) {
		this.myclass = myclass;
		System.out.println("setMyclass(MyClass myclass) 호출");
	}
	
	public void setDate(Date date) {
		System.out.println("setDate(Date date) 호출" );
		System.out.println("today : " + date.toLocaleString());
	}
	
	public void setNumber(int num) {
		System.out.println("setNumber(int num)호출" );
	}
	
	public void setArray(String[] arr) {
		System.out.println("setArray(String[] arr 호출");
		for(String s : arr) {
			System.out.println(s);
		}
	}
	
	public void setList(List<String> list) {
		System.out.println("setList(List<String> list) 출력");
		for(String s : list) {
			System.out.println(s);
		}
	}
	//Set 의 경우
	public void setSet(Set<String> set) {
		System.out.println("setSet(Set<String> set 호출");
		for(String s : set) {
			System.out.println(s);
		}
	}
	
	public void setMap(Map<Integer, String> map) {
		System.out.println("setMap(Map<Integer, String> map) 호출");
		//Entry 사용할 것 k : v 사용
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer,String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	public void setScore(List<Score> list) {
		System.out.println("setScore(List<Score> list) 호출");
		for(Score sc : list) {
			System.out.println(sc);
		}
	}
}








