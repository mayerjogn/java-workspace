package com.kh.step3;

public class BeepPrintThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("띵~~~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
