package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

	
	/*
	 * 삼항 연산자
	 * [표현법] 조건식 ? 식1 : 식2;
	 * 
	 * - 조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * - 조건식의 결과가 true 이면 식1을 수행한다.
	 * - 조건식의 결과가 false 이면 식2를 수행한다.
	 * */
	public static void main(String[] args) {
		
		F_Triple f = new F_Triple();
	//	f.method1();
	//	f.practice1();
		f.practice2();
	}
	
	public void method1() {
		int number = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		number = sc.nextInt();
		
		// 입력받은 정수가 양수인지 음수인지 판단
		result = (number > 0) ? "양수이다." : "음수이다.";
		System.out.println(result);		
		
		// 양수이다, 음수이다, 0이다
		result = (number > 0) ? "양수이다." : (number < 0) ? "음수이다." : "0이다";
		System.out.println(result);
	}
	/*
	 * 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서
	 * 두 정수의 곱셈 결과가 100보다 크거나 같은 경우 "결과가 100 이상입니다"
	 * 아닌 경우 "결과가 100보다 작습니다" 출력
	 * 
	 * */
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String result = ""; //null; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값1 : ");
		num1 = sc.nextInt();
		System.out.print("정수값2 : ");
		num2 = sc.nextInt();
		
		num3 = num1 * num2;
		
		result = (num3 >= 100) ? "결과가 100 이상입니다" : "결과가 100보다 작습니다";
		System.out.println(result);
		
	
	}
	
	/*문제2
	 * 
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다."
	 * 아닌 경우 "알파벳 대문자가 아니다." 출력
	 * 
	 * */
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("알파벳을 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		String result= "";
				
		result=(((ch >= 'A') &&(ch <='Z'))?"알파벳 대문자이다." : "알파벳 대문자가 아니다." );
		System.out.println(result);
	}
}	 