package com.kh.step4;

import com.kh.step4.model.Car;

public class Application {

	public static void main(String[] args) {

		Car c = new Car();
		
		/*
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		*/
		Car c1 = new Car("white", "auto",4);
		Car c2 = new Car("black", "manual");
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
	// 오버로딩
	
	/*
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드를
	 * 		  매개 변수의 자료형과 갯수, 순서가 다르게 작성되어야함
	 *  
	 * */
	
	void test() {}
//	void test() {}
	void test(int a) {}
	void test(int a, String s) {}
	void test(String s, int a) {}
	void test(int a, int b) {}

//	void test(int c, int b) {} // 매개변수의 자료형과 갯수와
							   // 순서가 다르게 작성되어야 함	 
	void test(String s) {}
	

	
	
	
	
	
}	