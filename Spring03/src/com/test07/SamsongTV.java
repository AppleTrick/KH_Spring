package com.test07;

public class SamsongTV implements TV {
	
	public SamsongTV() {
		// TODO Auto-generated constructor stub
		System.out.println("samsong 실행");
	}
	@Override
	public void powerOn() {
		System.out.println("삼송TV ON");
	}

	@Override
	public void powerOff() {
		System.out.println("삼송TV OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("삼송TV 볼륨 UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("삼송TV 볼륨 DOWN");
	}

}
