package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {

	boolean inputCheck = false;

	public static void main(String[] args) {

		InputThreadTest2 process = new InputThreadTest2();

		Thread t2 = new Thread(new InputThread(process));
		Thread t = new Thread(new CountingThread(process));

		t.start();
		t2.start();

	}
}

class InputThread implements Runnable {

	InputThreadTest2 process;

	InputThread(InputThreadTest2 process) {
		this.process = process;
	}

	@Override
	public void run() {

		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요.");
		System.out.println("입력하신 숫자는 " + input + "입니다");

		process.inputCheck = true;
	}

}

class CountingThread implements Runnable {

	// 2. 카운팅 작업

	InputThreadTest2 process;

	CountingThread(InputThreadTest2 process) {
		this.process = process;
	}

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			try {
				if (process.inputCheck)
					break;
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

		}
		if(!process.inputCheck) {
			System.out.println("10초 경과 되었습니다... 값 입력 초과!");
			System.exit(0);
		}

	}
}