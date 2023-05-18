package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	
	/*
	 * 논리 연산자
	 * - 두개의 논리값을 연산해주는 연산자
	 * - 논리연산한 결과마저도 논리값임!!
	 * 
	 * 논리값 && 논리값 : (and, 그리고) 왼쪽, 오른쪽 둘 다 true일 경우 결과값은 true
	 * 논리값 || 논리값 : (or, 또는) 왼쪽, 오른쪽 둘 중 하나라도 true일 경우 결과값은 true
	 *  
	 * */
	public static void main(String[] args) {
		E_Logical e = new E_Logical();
	//	e.method1(); 주석처리 ctrl + /
	//	e.method2();
		e.method3();
	}
	
	public void method1(){
		
		int number = 0;
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 정수값이 1부터 100 사이에 값인지 확인
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = sc.nextInt();
		
		// 1 <= number <= 100
		result = (number >= 1) && (number <= 100);
		System.out.println(number + "는 1부터 100 사이의 값인가요? : " + result);
		
		
	}
	public void method2() {
		
		
		// Short Cut Evaluation
		int number = 10;
		boolean result = false;
		
		// && 연산자를 기준으로 앞에서 이미 false가 나오면 뒤에 연산은 수행하지 않는다.
		result = (number < 5) && (++number > 0);
		
		System.out.println(result); // false
		System.out.println(number); // 10
		
		// || 연산자를 기준으로 앞에서 이미 true가 나오면 뒤의 연산은 수행하지 않는다.
		result = (number < 20) || (++number > 0);
		System.out.println(result);// true
		System.out.println(number);// 10
		
		
			
		}
	// 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기 
	// 'A'~'Z'까지가 코드값으로 65~90까지의 숫자로 나열 스캐너 사용하기
	public void method3() {
		String name = "a";
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력해 주세요. : " );
		 name = sc.next();
		 char c = name.charAt(0);
		 result = ((int)c >= 65 && (int)c <= 90);
		System.out.println(result);
	
	//  강사님코드	
	//	Scanner sc = new Scanner(System.in);
	//	char ch = sc.nextLine().charAt(0);
	//  System.out.println("사용자가 입력한 값이 대문자 입니까? : " + ((ch >= 'A') &&(ch <='Z'))); 	
		
		
	}
}
