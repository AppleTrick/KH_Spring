package com.test07;

public class LZTV implements TV {
	
	public LZTV() {
		// TODO Auto-generated constructor stub
		System.out.println("lz실행");
	}

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
