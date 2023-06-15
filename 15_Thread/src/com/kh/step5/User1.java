package com.kh.step5;

public class User1 extends Thread {

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		setName("CalculatorUser1");
	}
	public void run(){
		calculator.setMemory(100);
	}
}
