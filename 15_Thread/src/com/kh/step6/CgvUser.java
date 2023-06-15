package com.kh.step6;

public class CgvUser implements Runnable {

	private boolean seat = false; // 좌석예매가 끝나면 true를 할당
	
	@Override
	public void run() {
		try {
			reserve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	// 예매 기능
	public synchronized void reserve() throws InterruptedException {
		String name = Thread.currentThread().getName();
		System.out.println(name + "님, 예매하러 오셨습니다..!");
		
		if(seat == false) {
			Thread.sleep(2000);
			System.out.println(name + "님, 좌석 예매 성공");
			seat = true;
		}else {
			System.out.println(name + "님, 해당 좌석은 이미 예매 완료된 좌석입니다");
		}
	}
}
