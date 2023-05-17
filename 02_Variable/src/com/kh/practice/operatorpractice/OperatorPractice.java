package com.kh.practice.operatorpractice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args ) {
		OperatorPractice op = new OperatorPractice();
		
		
		op.method2();
//		op.method3();
		
//		op.method5();
//		op.method6();
		
	}
	
	
	public void method2() {
		 		
		Scanner sc = new Scanner(System.in);
		int num;
		int result;
		
		System.out.printf("양수를 입력해주세요 > ");
		num = sc.nextInt();
		result = (num/100*100);

		System.out.println(result);
 }
/*
	public void method3() {
		boolean b1 = true;
		boolean b2 = false;
		
		
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int a = sc.nextInt();
		
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		
		boolean result = (a,b,c == ) :true (a,b,c != ) : false; 
		
		System.out.println(result);
		
		
		
		
} 
	
*/		
	


	public void method5() {
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int a = sc.nextInt();
		
	}
	public void method6() {
		 
		
				Scanner sc = new Scanner(System.in);
				
				String str = "";
				
				
				System.out.print("사과의 개수 : ");
				int num1 = sc.nextInt();
				
				System.out.print("바구니의 크기 : ");
				int num2 = sc.nextInt();
				
				System.out.print("필요한 바구니의 수 : ");
				
				
	}	
}