package com.test06;

public class SamsongTV implements TV {

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
