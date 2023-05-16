package com.kh.pracitce;

import java.util.Scanner;

public class VariablePractice {
	
	//FQCN(Fully Qualified Class Name)
	//클래스가 속한 패키지명을 모두 포함한 이름
	
	public static void main(String[] args) {
	
		VariablePractice vp = new VariablePractice();
	//	vp.method1();
	//	vp.method2();
		vp.method3();
	//	vp.method4();
		

}
	
	/*
	public void method1() {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : > ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : > ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 :"+ (num1 * num2));
		System.out.println("나누기 몫 결과 :" +(num1 / num2));
		
		
}
*/
	public void method2() {
		char ch1 = 'a';
		char ch2 = 'b';	 
		
		
		
		System.out.println("성인 2명의 요금은"+"청소년 3명의 요금은"+"이며"+"총 금액은"+"입니다");
	}

	public void method3() {		
		int x = 5;
		int y = 7;
		int z = 9;
		
	
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요");
		 sc.next();
		
		
		System.out.print("첫번째 문자 : c\n"+"마지막 문자 : r");
		sc.nextLine();
		
		
}
}
