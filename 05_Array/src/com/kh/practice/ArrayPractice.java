package com.kh.practice;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
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

		// System.out.println(fruit[0]);
		// System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		// System.out.println(fruit[3]);
		// System.out.println(fruit[4]);
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
		System.out.print("정수 : ");
		int [] arr  = new int[sc.nextInt()];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
	
		}
		System.out.println( Arrays.toString(arr));
		System.out.println(sum);
		}
	
	

	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		String[] food = { "치킨", "피자", "떡볶이", "삼겹살", "닭발" };
		System.out.println("음식 입력 > ");
		String menu = sc.nextLine();
		boolean a = false;
		for (String b : food) {// b는 입력값 menu를 할당받고
			if (b.equals(menu))// .equals()로 for문 안에있는 b를 입력값 menu랑 비교해서 확인 해서 참이면 if문 출력 거짓이면 else문 출력
				a = true;
			
			if (a) {
				System.out.println("배달가능");
				break;

			} else {
				System.out.println("배달불가능");
			}
		}
	}
	
		//3번 문제는 입력값은 문자열로 입력 받아서 반복문을 이용해 배열에 있는 값들과 비교! break를 사용
		
			

	
		
	
		// = sc.nextLine();
//		Scanner sc = new Scanner(System.in);
//		String[] food = {"치킨","피자","삼겹살","떡볶이","국밥"};
//		
//			System.out.print("음식 번호 입력 > ");
//			int fnum = sc.nextInt();
		
			
			

	
	
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
		System.out.print("주민등록번호 입력 : ");
		String str = sc.nextLine();
		char[] a = new char[str.length()];

		for (int i = 0; i < a.length; i++) {
			a[i] = str.charAt(i);
		}
		char[] copy = new char[a.length];
		for (int i = 0; i < copy.length; i++) {

			if (i <= 7) {
				copy[i] = a[i];
			} else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}

	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		System.out.print("단어 입력 : ");
		String word = sc.nextLine();
		char[] w = word.toCharArray();

		for (int i = w.length - 1; i >= 0; i--) {
			System.out.print(w[i]);
		}
	}

public static void main(String[] args) {
		ArrayPractice a = new ArrayPractice();
//		a.method1();//o
		a.method2();//△
//		a.method3();//△
//		a.method4();//
//		a.method5();//o

}
}
