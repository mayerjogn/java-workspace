package com.kh.practice;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice {
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		String[] fruit = new String[5];
				
		fruit[0] = ("apple");
		fruit[1] = ("banna");
		fruit[2] = ("peach");
		fruit[3] = ("mango");
		fruit[4] = ("watermelon");
		
	//	System.out.println(fruit[0]);
	//	System.out.println(fruit[1]);
		System.out.println(fruit[2]);
	//	System.out.println(fruit[3]);
	//	System.out.println(fruit[4]);
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		int [] arr = new int[5]; 
		Scanner sc = new Scanner(System.in);
	  for(int i = 0; i<arr.length; i++) {
		//  arr[i] = 
		  System.out.print("정수 : ");
		  arr[i]=sc.nextInt();
		  
		  
	  }
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		String[] food = new String [5];//{{"치킨"},{"피자"},{"탕수육"},{"떡볶이"},{"곱창"}};
//		String str = Arrays.toString(arr);
		food[0] = "치킨";
		food[1] = "피자";
		food[2] = "탕수육";
		food[3] = "떡볶이";
		food[4] = "곱창";
		for(int i=0; i<food.length; i++ ) {	
			System.out.print("정수 입력 > ");
			String food1=sc.nextLine();
			
		//	Arrays.toString 이거써보셈
		
		}
		
		
		
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
	}
	

public static void main(String[] args) {
		ArrayPractice a = new ArrayPractice();
//		a.method1();//o
//		a.method2();//x
		a.method3();//
//		a.method4();
//		a.method5();
}

}