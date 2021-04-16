package com.test06;

public class LZTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LZTV ON");
	}

	@Override
	public void powerOff() {
		System.out.println("LZTV OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("LZTV 볼륨 UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("LZTV 볼륨 DOWN");
	}

}
