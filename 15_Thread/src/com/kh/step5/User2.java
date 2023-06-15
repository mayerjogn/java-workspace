package com.kh.step5;

public class User2 extends Thread {
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		setName("CalculatorUser2");
	}
	
	public void run() {
		calculator.setMemory(50);
	}

}
