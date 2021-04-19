package com.test03;

import org.springframework.stereotype.Component;


// SamsongTV samsong = new SamsongTV
// 객체이름을 직접 선언하여 사용가능하다.
@Component("samsong")
public class SamsongTV implements TV {
	
	public SamsongTV() {
		System.out.println("Samsong tv 생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Samsong tv 파워 온");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Samsong tv 파워 오프");

	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub
		System.out.println("Samsong tv 볼륨업");

	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("Samsong tv 볼륨다운");

	}

}
