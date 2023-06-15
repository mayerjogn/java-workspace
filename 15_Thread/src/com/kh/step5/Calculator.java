package com.kh.step5;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	/*
	 * 동기화(Synchronized)
	 * - 스레드가 사용 중인 객체의 작업이 끝날 때 까지 사용 중인 객체에 잠금을 걸어서 다른 스레드가 접근할 수 없도록하게 만든것
	 * - 동기화 처리는 무거워서 해당 하는 기능에만 처리해야 한다. 
	 * */
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
