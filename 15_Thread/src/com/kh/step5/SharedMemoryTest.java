package com.kh.step5;

public class SharedMemoryTest {

	public static void main(String[] args) {
		Calculator calculrator = new Calculator();
		
		
		User1 user1 = new User1();
		user1.setCalculator(calculrator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculrator);
		user2.start();
		
	}

}
