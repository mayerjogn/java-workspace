package com.kh.pracitce;

import java.util.Scanner;

public class VariablePractice {
	
	//FQCN(Fully Qualified Class Name)
	//클래스가 속한 패키지명을 모두 포함한 이름
	
	public static void main(String[] args) {
	
		VariablePractice vp = new VariablePractice();
	//	vp.method1();
		vp.method2();
	//	vp.method3();
	//	vp.method4();
		

}
	
	
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
		
		


	
	public void method2() { //문제에 있는 비슷한 숫자로 연산하는 문제
		String a = "성인 2명 : ";
		String b = "청소년 3명 : ";		
		String c = "총 금액 : ";
		
		int i = 20000;
		int x = 21000;
		int z = 41000;
		System.out.println(a+i+"원");
		System.out.println(b+x+"원");
		System.out.println(c+z+"원");
	}

	public void method3() {	//임시 변수 하나 추가해서 해보기	
		int x = 5;
		int y = 7;
		int z = 9;
		
		int num1 =7;
		int num2 =9;
		int num3 =5;
		
		int result1 = x=7;
		int result2 = y=9;
		int result3 = z=5;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		System.out.println("result1" + result1);
		System.out.println("result2" + result2);
		System.out.println("result3" + result3);
	}

	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		String a  ="문자열을 입력하세요 : ";
		
		System.out.print(a);
		a = sc.nextLine();
		
		//c1 = sc.nextLine().charAt(0);
		//c2 = sc.nextLine().charAt(-1);
		
		System.out.println("첫번째 문자 : " + a.charAt(0));
		System.out.println("마지막 문자 : " + a.charAt(a.length()-1));
		
		
	//	System.out.println("마지막 문자 : " );
	//	String  = "첫번째 문자 : c\n마지막 문자 : r";
	//	String c = "마지막 문자 : r";
	//	result = sc.next();
	//	System.out.printf(result);
				
	//	System.out.printf(b);
		
		
		/*		System.out.print("문자열을 입력하세요 : ");
		sc.nextLine();
		
		
		System.out.print("첫번째 문자 : c\n"+"마지막 문자 : r");
		sc.nextLine();*/
}
	
}
