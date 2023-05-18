package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	
	/*
	 * 비교 연산자
	 * a < b : a가 b보다 작은가?
	 * a > b : a가 b보다 큰가?
	 * a <=b : a가 b보다 작거나 같은가?
	 * a >=b : a가 b보다 크거나 같은가?
	 * a == b : a와 b가 같은가?
	 * a != b : a와 b가 같지 않은가?
	 * 
	 * - 비교 연산의 조건을 만족하면 true, 만족하지 않으면 false를 반환한다.
	 * 
	 * */
	public static void main(String[] args) {
		
		D_Comparison d = new D_Comparison();
//		d.method1();
		d.method2();
	}
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b)); //false
		System.out.println("a <= b : "+ (a <= b)); //true
		
		boolean result = (a > b);
		System.out.println("result : " + result); //false
		
		// 산술연산 + 비교연산
		
		System.out.println((a * 2) > (b / 5 )); //true
		
		System.out.println("a가 짝수인가 : " + (a % 2 == 0));  //true
		System.out.println("a가 홀수인가 : " + (a % 2 == 1));  //false
		System.out.println("a가 홀수인가 : " + (a % 2 != 0));  //false
		System.out.println("a가 홀수인가 : " + !(a % 2 == 0)); //false
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("첫번째가 두번째보다 큽니까 :" + (num1 > num2));
		System.out.println("첫번째 정수가 짝수입니까 : " + (num1 % 2 ==0));
		
		// 문자와 숫자간의 대소비교 가능!
		System.out.println(num2 > 'A');
		//'A' ~ 'Z' : 65 ~ 90 까지의 숫자로 연달아 나열되어있음 
		
		
		
	}
}
