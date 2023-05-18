package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		OperatorPractice op =new OperatorPractice();
		//op.method1();
		//op.method2();
		//op.method3();
		//op.method4();
		op.method5();
	//	op.method6();
	}
	
	public void method1() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("인원 수 : " );
		num1 = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		num2 = sc.nextInt();
		
		num3 = num2 / num1;
		num4 = num2 % num1;
		
		
		
		System.out.println("1인당 연필 개수 : " + num3);
		System.out.println("남는 연필 개수 : " + num4);
		
		
	}
	
	public void method2() {
		int num1 = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 > ");
		num1 = sc.nextInt();
		
	//	result=
			
	}
	
	public void method3() {
		int a = 0;
		int b = 0;
		int c = 0;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : "  );
		a = sc.nextInt();
		
		System.out.print("입력2 : "  );
		b = sc.nextInt();
		
		System.out.print("입력3 : " );
		c = sc.nextInt();
		
		//boolean result = (a==b==c);
	//	System.out.println(result);
		
		
		 
		
		
		
	}
	
	
	
	
	public void method4() {
		int num1 = 0;
		String result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. : ");
		num1 = sc.nextInt();
		
		result = (num1 % 2 ==0) ? "짝수다" : "홀수다";
		System.out.println(result);
		
	}
	public void method5() {
		int a = 0;
		int b = 0;
		int c = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : " );
		a = sc.nextInt();
		
		System.out.println("어린이");
		b = sc.nextInt();
				
		System.out.println("청소년");
		c = sc.nextInt();
		
		System.out.println("성인");
				
	}
	public void method6() {
}
}