package com.test03;

import org.springframework.stereotype.Component;


// IgTV igtv = new IgTV();
// 클래스이름은 그대로 가지만 앞에 글자만 소문자로 바꿔준다.
@Component
public class IgTV implements TV {
	
	public IgTV() {
		System.out.println("ig tv 생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("ig tv 파워 온");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("ig tv 파워 오프");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub
		System.out.println("ig tv 볼륨업");

	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("ig tv 볼륨다운");

	}

}
