package com.kh.step3;

import java.awt.Toolkit;

public class BeepThread implements Runnable {

	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}

	}
}