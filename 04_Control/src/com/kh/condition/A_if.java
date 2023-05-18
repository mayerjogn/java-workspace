package com.kh.condition;

import java.util.Scanner;

public class A_if {
	
	Scanner sc = new Scanner(System.in); // 인스턴스 변수 메인 위에 있으면 한 클래스에 다 적용됨
	
	/*
	 * if 문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 * 		.. 조건식이 참(true)일 때 실행할 코드..
	 * }
	 * 
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 */
	public void method1() {
		
		int score = 80; //지역 변수 한 메서드 안에서만 사용하는 변수
		
		//만약 (60점 이상){ 의사 코드 (슈도코드,pseudoced)
		// 60점 이상이어야 합격!
		if(score >= 60) {//권장
		System.out.println("합격!");
		}										
//		if(score >= 60)
//			System.out.println("합격!"); //{}생략하고도 출력가능하지만 비추
//		    System.out.println("축하드려요!");
		if(score >= 60) System.out.println("합격!");
		
		//불합격!
		if(score < 60) System.out.println("불합격!");
	}
	/* 
	 * if-else문
	 * 
	 * [표현법]
	 * 
	 * if조건식{
	 * 		...조건식이 참(true)일 때 실행할 코드...
	 * }
	 * else{
	 * 		...조건식이 거짓(false)일 때 실행할 코드...
	 * }
	 */
	 
	public void method2() {
		
		int score = 0;
		
		System.out.print("점수 입력 > ");
		score = sc.nextInt();
		
		if(score >=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
				
		//삼항연산자
		System.out.println((score >= 60)? "합격!" : "불합격!" );
	//	(scored >=60 ) ? "합격" : "불합격"
	}
	
	public void method3() {
		
		String name = "";
		
		System.out.print("이름 입력 > ");
		name = sc.nextLine();
		if("이지훈".equals(name)) {
		
		System.out.println("이지훈" == name);// false
		System.out.println("이지훈".equals(name));//true , String 클래스의 equals() 메소드
//		System.out.println("이지훈".charAt(0)); //String 클래스의 charAt(0)메소드
		
		//본인이면 "본인이다.", 본인이 아니라면 "본인이 아니다."
		if("이지훈".equals(name)) {
			System.out.println("본인이다.");
		}
		else {
			System.out.println("본인이 아니다.");
			// 이지훈(이름) 일치한지 아닌지 판단
		}
		
		}			
		}		
		
		public void method4() {
			int number = 0;
			
			System.out.print("숫자 입력>");
			number = sc.nextInt();
			//0보다 크면 "양수", 아니면 "음수"
			if(number > 0) {
				System.out.println("양수");
			}
			else {
	//			System.out.println("음수");
			if(number == 0) {
				System.	out.println("0입니다");
			}
			else {
				System.out.println("음수");
			}
			
			}				
		}

		
		/*
		 * if-else if-else문
		 * 
		 * [표현법]
		 * 
		 * if(조건식1){
		 * 		...조건식이 참(true)일 때 실행할 코드...
		 * }  else if(조건식2) {
		 *     ... 조건식2가 참(true)일 때 실행할 코드...
		 * 
		 * }else{
		 *    ... 위에 어느 조건식에도 만족하지 않을 때 실행할 코드...
		 *  }
		 *  
		 *  - else if 수는 제한이 없다.
		 *  - else는 생략 가능하다.	
		 * */
		
		public void method5() {
			
			int number = 0;
			
			System.out.print("숫자입력 >");
			number = sc.nextInt();
			
			if(number > 0) {
				System.out.println("양수");
			} else if(number < 0) {
				System.out.println("음수");
			}else{
				System.out.println("0입니다.");
			}
			
		}
		/*
		 * 사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력하라
		 * - 90점 이상은 A 등급
		 * - 90점 미만 80상 이상은 B 등급
		 * - 80점 미만 70점 이상은 C 등급
		 * - 70점 미만 60점 이상은 D 등급
		 * - 60점 미만 F등급
		 * */
		
		public void method6() {
			
			int number = 0;
			
			System.out.print("점수 입력 >");
			number = sc.nextInt();
			
			if(number >= 90) {
				System.out.println("A 등급");				
			}else if (number >= 90 ) {
				System.out.println("B 등급");
			}else if (number > 80) {
				System.out.println("C 등급");				
			}else if (number > 70) {
				System.out.println("D 등급");				
			}else {
				System.out.println("F 등급");
			}
		/*
		 * int score = 0;
		 * score = sc.nextInt();
		 * if (score>=) {
		 *  System.out.print("A");
		 * else if(score< 90&& score >= 80){
		 *  System.out.print("B");
		 * }else if(score <80&& score >=70{
		 *  System.out.print("C");
		 * }else if(score <70&& score >=60
		 *  System.out.print("D");
		 *  }else{
		 *  System.out.println("F");
		 * */	
			char grade ='\u0000';
			
			  int score = 0;
			  score = sc.nextInt();
//			  if (score >= 90) {
//			   grade = 'A';
//			  else if(score< 90&& score >= 80){
			   grade = 'B';
//			  }else if(score <80&& score >=70{
			   grade = 'C';
//			  }else if(score <70&& score >=60{
			   grade = 'D';
//			  }else{
//			   grade = 'F'
//					   System.out.println(grade);
			  }		  
			  
			  /*
				 * 세 정수를 입력했을 때 짝수만 출력
				 * num1 입력 > 3
				 * num2 입력 > 4
				 * num3 입력 > 6
				 * 4
				 * 6
				 * */
			  public void Practice1() {
								
				System.out.println("num1 입력>");
				int num1 = sc.nextInt();
				
				System.out.println("num2 입력>");
				int num2 = sc.nextInt();
				System.out.println("num3 입력>");
				int num3 = sc.nextInt();
				
				if(num1%2==0) System.out.println(num1);					
				if(num2%2==0) System.out.println(num2);				
				if(num3%2==0) System.out.println(num3);
					
					
				}
			  
			  
			  /*
			   * 정수 1개를 입력했을 때 음(minus)/양(plus)/0(zero)
			   * 							짝(even)/홀(odd)출력			
			   * */

			  public void Practice2() {
				  
				  System.out.println("정수 입력 > ");
				  int num = sc.nextInt();
				  
				  if(num > 0) 
					  System.out.println("plus");
				  else if (num == 0)
					  System.out.println("zero");
				  else
					  System.out.println("minus");
				  
				  if (num %2==0) 
					  System.out.println("even");
				  else
					  System.out.println("odd");
				  }
				  
				  
				  
			/*	if(num<0) {
					System.out.println("minus");
				}else if(num% 2==1) {
						System.out.print("odd");
					
				}else if(num>0){
					System.out.println("plus");	
					if (num% 2==0) {
						System.out.println("even");
					}
				}else  {
					System.out.println("zero");
				}
				}
				 */
						  
		//		if(num1<0) System.out.print("minus");  
		//		if(num2>0) System.out.print("plus");
		//		if(num3==0)System.out.print("zero");
		//		if(num)System.out.print("even");
		//		if(num)System.out.print("odd");
			  
	
	public static void main(String[] args) {
		A_if a = new A_if();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.Practice1();
		a.Practice2();
		
	}

	

}
