package com.kh._interface.step2;

public class Advanced implements Player {

	@Override
	public void run() {
		System.out.println("빨리 달리다");
	}

	@Override
	public void jump() {
		System.out.println("점프는 할 수 있지!");
	}

	@Override
	public void turn() {
		System.out.println("턴은 못 해 ㅠㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 중급자 레벨 =====");
	}

}
