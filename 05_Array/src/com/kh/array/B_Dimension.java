package com.kh.array;

import java.util.Arrays;

public class B_Dimension {

	

	/*
	 * 다차원 배열 : '[]'의 개수가 차원의 수를 의미
	 * 
	 * 1. 2차원 배열의 선언
	 * 
	 * 	  [표현법]
	 * 
	 *    자료형[][] 배열명;
	 *    자료형 배열명[][];
	 *    자료형[]배열명[];
	 *    
	 * 2. 2차원 배열의 생성
	 *    
	 * 	  [표현법]
	 * 
	 * 	  배열명 = new 자료형[행 크기][열 크기];
	 * 
	 * 3. 2차원 배열의 선언과 초기화를 동시에 진행
	 * 
	 * 	  [표현법]
	 * 
	 *    자료형[][] 배열명 = new 자료형[행 크기][열 크기];
	 *    자료형 배열명[][] = new 자료형[행 크기][열 크기];
	 *    자료형[]배열명[] =  new 자료형[향 크기][열 크기];
	 *    
	 * 4. 2차원 배열의 선언과 초기화
	 * 
	 *    1) 배열 변수와 인덱스를 이용해 초기화
	 *    	 배열명[0][0] = 값;
	 *    	 배열명[0][1] = 값;
	 *       배열명[1][0] = 값;
	 *       ....	
	 * */
	
	

	//2) 선언과 동시에 초기화
	public void method1() {
		int[][] arr = /*new int[][]*/ {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		
		for(int i=0; i<arr.length; i++);{			
			int i = 0;
			System.out.println(Arrays.toString(arr[i]));
			  
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			
		}
		/*
		 * 1
		 * 2
		 * 3
		 * ..
		 * 14
		 * 15
		 * */
		
				
		/*
		 * [1,2,3,4,5]
		 * [6,7,8,9,10]
		 * [11,12,13,14,15]
		 * 
		 * */
	}
	
	//3)중첩 반복문을 이용한 초기화
	public void method2() {
		
		int[][] arr = new int[3][5];
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		// 출력!
		for(int[] i : arr) {
			for(int j : i) {
				System.out.println(j);
				
			}
		}
	}
	
	//가변 배열 : 다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정
	//
	public void method3() {
		int[][]arr = {{1,2},{3,4,5},{6,7,8,9,10}};
		
		for(int[] i : arr) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}
	
	/*
	 * [Java, Oracle, JDBC]
	 * [HTML, CSS, JavaScript, jQuery]
	 * [Servlet, JSP, MyBatis]
	 * [Spring, React]
	 * 
	 * */
	
	public void method4() {
		String[][] arr ={
				{"[Java, Oracle, JDBC]"},{"[HTML, CSS, JavaScript, jQuery]"},
				{"[Servlet, JSP, MyBatis]"},{"[Spring,React]"}};
			for(String[] i : arr) {
				System.out.println(Arrays.toString(i));
//				for(String j : i) {
//					System.out.println(j); 내가짠거
				}
				
			}
		
	
	

	public static void main(String[] args) {
		B_Dimension b = new B_Dimension();
	//	b.method1();
	//	b.method2();
	//	b.method3();
	//	b.method4();
	}

}
