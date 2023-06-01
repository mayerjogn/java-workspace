package com.kh._interface.step2;

public class Beginner implements Player {

	@Override
	public void run() {
		System.out.println("천천히 달린다");
	}

	@Override
	public void jump() {
		System.out.println("점프는 할 줄 몰라 ㅠㅠ");
	}

	@Override
	public void turn() {
		System.out.println("턴도 할 줄 몰라");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====초보자 레벨 =====");
	}

}
