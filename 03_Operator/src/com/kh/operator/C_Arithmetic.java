package com.kh.operator;


public class C_Arithmetic {

	/*
	 * 산술 연산자
	 * 
	 *  + (더하기)
	 *  - (빼기)
	 *  * (곱하기)
	 *  / (나누기)
	 *  % (나머지)
	 *  
	 * */
	 public static void main(String[] args) {
		 C_Arithmetic c= new C_Arithmetic();
//		 c.method1();
		 c.method2();
	 }
	 public void method1() {
		 int num1 = 10;
		 int num2 = 3;
		 
		 System.out.println("num1 + num2 = " + (num1 + num2));// 13
		 System.out.println("num1 - num2 = " +(num1-num2));// 7
		 System.out.println("num1 * num2 = " + (num1 * num2));// 30
		 System.out.println("num1 / num2 = " + (num1 / num2));// 나누기했을때의 몫 : 3
		 System.out.println("num1 % num2 = " + (num1 % num2));// 나누기했을때의 나머지 : 1
		 
	 }
	 
	 public void method2() {
		 int a = 5;
		 int b = 10;
		 int c = (++a) + b; //a=6, b=10, c=16
		 int d = c / a; // a=6, b=10, c=16, d=2
		 int e = c % a; // a=6, b=10, c=16, d=2, e=4
		 int f = e++; // a=6 , b=10 c=16, d=2, e=4(5) ,f=4
		 int g = (--b) + (d--); // g=11, b=9, d=1
		 int h = 2;
		 int i = (a++) + b/(--c / f) * (g-- -d) %(++e + h);//
		 		//6 + 9 / (15 / 4)  * (11 - 1) %(6 + 2)
		 		//6 + 9 /    3      *   10     %   8
		 		//6 + 9 /    3     	*	10 		%	 8 
		 		//6 + 9     30   %8
		 		//6 + 6
		 		//12
		 System.out.println("f : " + f);//4
		 System.out.println("i : " + i);
		 
		 
		 
		 
	 }
}
