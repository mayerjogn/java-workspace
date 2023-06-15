package com.kh.step6;

public class CgvUserProcess {

	public static void main(String[] args) {

		CgvUser user = new CgvUser();
		
		
		Thread t1 = new Thread(user, "김지은");
		Thread t2 = new Thread(user, "노석우");
		
		t1.start();
		t2.start();
	}

}
