package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		OperatorPractice op =new OperatorPractice();
	//	op.method1();
	//	op.method2();
	//	op.method3();
	//	op.method4();
	//	op.method5();
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
	Scanner sc = new Scanner(System.in);
		int num;
		int result ;
		
		
		System.out.print("양수를 입력해주세요 > ");
		num = sc.nextInt();
		result = (num/100*100);
		
		System.out.println(result);
		
	//	result=
			
	}
	
	public void method3() {
		int i = 0;	
		int x = 0;
		int z = 0;
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : "  );
		i = sc.nextInt();
		
		System.out.print("입력2 : "  );
		x = sc.nextInt();
		
		System.out.print("입력3 : " );
		z = sc.nextInt();
		
		result = (i==x && x==z );
		System.out.println(result);
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : " );
		int num = sc.nextInt();
		
		String a =(num <=13)?"어린이" : (num <= 19) ? "청소년":"성인";
		System.out.println(a);
		
				
	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("사과의 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int num2 = sc.nextInt();

		System.out.print("필요한 바구니의 수 : ");
		
		int num3 =num1/num2 + (num1%num2>0 ? 1:0);
		int result = num3 ; 

		System.out.println(result);

}
}