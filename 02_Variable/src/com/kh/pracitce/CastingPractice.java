package com.kh.pracitce;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice();
		
		cp.method1();
		cp.method2();
		
	}
	public void method1() {
		Scanner sc = new Scanner(System.in);
				
		System.out.printf("문자 : ");
		String name = sc.next();
		
		int num1 = 'A';
		int num2 = 'B';
		
		
		System.out.println("A unicode : " + num1);
		System.out.println("B unicode : " + num2);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
//		int iNum = 115;
//		double bNum = 38.33;
		
		
		
//		System.out.printf("총점 : " + iNum);
//	    System.out.printf("\n평균 : " + bNum);
		
		float f1 =(a+b+c);
		float f2 = (f1/3);
		
		System.out.printf("총점 : " + f1);
		System.out.printf("\n평균 : " + f2);
	    //저는 이거처럼 계산해서 소수점 2자리까지만 나타내고 싶은데  &.f\를 어디다 넣어야 하는지 아니면 코드를 다시짜야 하는지 잘 모르겠어요
	}
	
}
