package com.kh.pracitce;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice();
		
//		cp.method1();
		cp.method2();
		
	}
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 : ");
		String name = sc.next();
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		int sum1 = (a+b+c);
		int sum2 = (sum1/3);
		System.out.printf("총점 : " + sum1);
	    System.out.printf("\n평균 : " + sum2 );
	}
	
}
