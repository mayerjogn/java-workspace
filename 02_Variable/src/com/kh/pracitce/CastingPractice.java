package com.kh.pracitce;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice();
		
	//	cp.method1();
	//	cp.method2();
		
	}
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자 : ");
		String name = sc.next();
				
		
		char ch = name.charAt(0);
		System.out.println("A unicode : " + (int)ch); 
		System.out.println("B unicode : " + ((int)ch+1));
		
		//System.out.println();
		//char ch2 = name.charAt(0);
		//System.out.print("unicode : " + (int)ch2 );
		
		//char ch1 = name.charAt(0);
		
		//System.out.print("unicode :  ");
		
		//char ch2 = name.charAt(0);
		
		
		
		//System.out.printf("%s :  " +(int)ch1  );
		//System.out.println();
		//System.out.printf("%s :  " +(int)ch2 );
		
		
		//char ch1 = name.charAt(0);
		//char ch2 = name.charAt(0);
		//int num1 = 'A';
		//int num2 = 'B';
			
		//System.out.println("A unicode : " + (int) 'A');
		//System.out.println("B unicode : " + (int) 'B');
		//System.out.println("A unicode : " + 'A');
		//System.out.println("B unicode : " + 'B');
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
				
		float f1 = a + b + c ; 
		float f2 = f1 / 3 ; 
		
		
		System.out.printf("총점 : %.0f\n" , f1);
		System.out.printf("평균 : %.2f\n " , f2);
		

	}
	
}
