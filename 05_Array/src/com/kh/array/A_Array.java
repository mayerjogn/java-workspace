package com.kh.array;
import java.util.Arrays;
import java.util.Scanner;
public class A_Array {
	Scanner sc = new Scanner(System.in);
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음
	 *      "같은 자료형의 값"으로만 담을 수 있음
	 * 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김
	 * (인덱스는 0부터 시작!)
	 * 
	 * 1. 배열의 선언
	 * 
	 *     [표현법]
	 *     
	 *     자료형[] 배열명;
	 *     자료형 배열명[];
	 *     
	 * 2. 배열의 초기화
	 * 
	 *      [표현법]
	 *      
	 *      배열명 = new 자료형[배열 크기];
	 *      
	 * 3. 배열의 선언과 초기화를 동시에 진행
	 * 
	 *      [표현법]
	 *      
	 *      자료형[] 배열명 = new 자료형[배열 크기];
	 *      자료형 배열명[] = new 자료형[배열 크기];
	 * */
	
	
	// 배열의 선언과 초기화
	// 1) 배열 변수와 인덱스를 이용해 초기화
	public void method1() {
		
		int[] score = new int[5]; //배열의 크기를 지정하지 않으면 에러!
		/*
		 * 기본 자료형 : 스택 메모리에 생성된 공간에 실제 변수값을 저장하는 반면
		 * 참조 자료형 : 실제 데이터 값은 힙 메모리에 저장하고,
		 * 	class	  스택 메모리의 변수 공간에는 실제 변수값이 저장된 힙 메모리의 주소값 저장
		 * */
		
//		System.out.println(score);//[I@3d012ddd
		/*
		 * - 배열을 생성하고 초기화 해주지 않아도 문제없이 출력!
		 * - JVM이 지정한 기본값으로 배열이 초기화
		 *   (정수형 : 0, 실수형 : 0.0; 문자형 : \u0000,
		 *    논리형 : false, 참조형 : null)
		 * */
		// 초기화!
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
	}
	
	// 2) 선언과 동시에 초기화
	public void method2() {
		int[] score = /*new int[]*/ {100,90,80,70,60};
		
		
		int[] score2;
		// score2 = {100,90,80,70,60}; // 이건안됨
		
		// 반복문을 사용해서!
		// 문자열.lenght(), 배열.lenght <-주의
		for(int i=0 ; i<score.length;  i++) {
			System.out.println(score[i]);
		}
		
	}
	// 3) 반복문을 이용한 초기화
	public  void method3(){
		
		int[] score = new int [5];
		int num = 100;
		for(int i=0; i<score.length; i++) {
			score[i] = num;
			num-=10;
		}
		/*
		 * 향상된 for 문
		 * - 자바 5부터 배열 및 컬렉션 객체를 좀 더 쉽게 처리할 목적으로 제공
		 * -증감식을 사용하지 않고 배열 및 컬렉션의 요소 개수만큼 반복하고 for문을 종료
		 * */
		for(int s : score) {
			System.out.println(s);			
		}
	}
	/*
	 * 3명의 키를 입력받아 배열에 저장하고 3명의 키의 평균값을 구하시오.
	 * 키 입력 > 180
	 * 키 입력 > 177.3
	 * 키 입력 > 168.2
	 * 175.2
	 * */
	public void method4() {
		double[] arr = new double[3];
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		/*
		 * arr[0] = sc.nextDouble();
		 * arr[1] = sc.nextDouble();
		 * arr[2] = sc.nextDouble();
		 * */
		for(int i =0; i<arr.length; i++) {			
		System.out.println("키 입력 > ");	
		arr[i] = sc.nextDouble();
		sum += arr[i];
						
		}
		System.out.printf("%.1f", sum/arr.length);
		
	}
	
//		double[] a = new double[] {180,177.3,168.2} ;
//		 	
//		while(true) {			
//			System.out.print("키 입력 > ");		
//			a = sc.nextInt();
//	//		for(int i =0; i<a.length; i++) {
				
			
//		}
		
//	}
	
	
	// 배열의 복사
	
	//1. 얕은 복사 : 배열의 주소만 복사
	public void method5() {
		int[] number = {1,2,3,4,5};
		int[] copy = number;
		
		//System.out.println(number);
		//System.out.println(copy);
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
		copy[1] = 20;
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(Arrays.toString(number) == Arrays.toString(copy));//false;
		
		System.out.println(number.hashCode());// 객체를 식별할 하나의 정수값
		System.out.println(copy.hashCode());
		System.out.println(number.hashCode() == copy.hashCode());//true
	}
	
	//2. 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 내부의 값들도 함께 복사
	//1) for 문을 이용한 깊은 복사	
	public void method6() {
		
		int[] number = {1,2,3,4,5};
		int[] copy = new int[5];
		
		for(int i=0; i<number.length; i++) {
			copy[i] = number[i];
		}
		
		copy[1] = 20;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(number.hashCode());
		System.out.println(copy.hashCode());
	}
	/*
	 * 2) System 클래스에서 제공하는 arraycopy() 메소드를 이용한 깊은 복사
	 * 
	 *    [표현법]
	 *    
	 *    System.arraycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 
	 *    복사 시작 인덱스(앞에 복사본의 시작할 인덱스), 복사할 길이);
	 * */
	public void method7() {
		
		int[] number= {1,2,3,4,5};
		int[] copy = new int[5];
		
		System.arraycopy(number, 0, copy, 0, number.length);
		
		copy[2] = 30;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
	}
	//(Arrays.toString(arr))= 배열 전부를 꺼낼때
	/*
	 * 3) Arrays 클래스에서 제공하는 copyOf() 메소드를 이용한 깊은 복사
	 * 
	 * 		 [표현법]
	 *     
	 *     Arrays.copyOf(원본 배열, 복사본 배열 길이);
	 * */
	
	public void method8() {
		
		int[] number= {1,2,3,4,5};
		int[] copy = null;
		
		//System.out.println(copy.length);// NullPointerException 오류
		
		copy = Arrays.copyOf(number,number.length);
		
		copy[3] = 10;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
	}
	//4) 배열의 clone() 메소드를 이용하는 방법
	public void method9() {
		
		int[] number= {1,2,3,4,5};
		int[] copy=null;
				
		copy = number.clone();
		
		copy[3] = 10;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
	}
	
	public static void main(String[] args) {
		A_Array a = new A_Array();
	//	a.method1();
	//	a.method2();
	//	a.method3();
	//	a.method4();
	//	a.method5();
	//	a.method6();
	//	a.method7();
	//	a.method8();
	//	a.method9();
		
	}

}
