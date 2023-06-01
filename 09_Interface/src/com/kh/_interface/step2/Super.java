package com.kh._interface.step2;

public class Super implements Player{

	@Override
	public void run() {
		System.out.println("엄청 빨리 달리다");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프 할 수 있지!");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴는 돌아~~");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 고급자 레벨 ======");
	}

}
