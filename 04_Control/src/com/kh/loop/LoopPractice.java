package com.kh.loop;

import java.util.Scanner;

public class LoopPractice {

	

	public static void main(String[] args) {
		LoopPractice l = new LoopPractice();

		// l.method1(); //o
		// l.method2(); //흠..
		// l.method3(); //o
		// l.method4(); //o
		 l.method5();//마지막
		 // l.method6();//o
	}

	Scanner sc = new Scanner(System.in);

	/*
	 * 사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
	 *  사용자 입력 : 5 
	 *  5
	 *  4
	 *  3
	 *  2
	 *  1
	 */
	public void method1() {
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if (num >= 1 && num <= 100) {
			for (int i = num; i >= 1; i--) {
				System.out.println(i);
			}

		}
	}

	// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
	public void method2() {

		int sum = 0;
		for (int i = 1;; i++) {
			if (i % 2 == 0) {
				sum -= i;
			} else
				sum += i;
			if (sum >= 100) {
				System.out.println(i);
				System.out.println("sum : " + sum);
				break;
			}
		}
		int i = 0;
		while(sum <= 100) {//i가 100보다 작거나 같을때까지 반복하고
			if(i % 2 == 0) sum -= i;// 요기서 i가 짝수면 sum에서 i를 빼고
			else sum += i;// 아니면 sum에 i를 더한다는게 맞나요?
		}
		System.out.println(i);
		//System.out.println("sum : " + sum); 아하
	}
    		
    	

    
				
	

	/*
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요.
	 * 
	 * 문자열 : banana 문자 : a banana 안에 포함된 a 개수 : 3
	 * 
	 */
	public void method3() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		int a = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				a++; // 카운트를 세거나 더한다는 정도로 이해해도 될까요??
			}

		}
		System.out.println(str + "안에 포함된 " + ch + "개수 " + a);

	}

	/*
	 * 0이 나올 때까지 숫자를 출력하시오. (random 1~10 사용!) 7 3 4 2 3 4 0
	 */
	public void method4() {

		for (int i=0;;i++) {
			double random = Math.random()*11;
			int num = (int)random;
			System.out.println(num);
			if (num == 0) {
				break;
			}

		} 
	}
	/*
	 * 주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
	 * 
	 * 1 : 3 
	 * 2 : 2 
	 * 3 : 1 
	 * 4 : 0 
	 * 5 : 4 
	 * 6 : 0
	 * 
	 */
	public void method5() {
		int fir = 0;
		int sec = 0;
		int thi = 0;
		int fou = 0;
		int fif = 0;
		int six = 0;
		
		for (int i = 1; i <= 10; i++) {
			int num = (int) (Math.random() * 6)+1;
			
		switch(num) {
		case 1:
			++ fir;
			break;
		case 2:
			++ sec;
			break;
		case 3:
			++ thi;
			break;
		case 4:
			++ fou;
			break;
		case 5:
			++ fif;
			break;
		case 6:
			++ six;
			break;
			
		}
		}
		System.out.println("1 : "+fir);
		System.out.println("2 : "+sec);
		System.out.println("3 : "+thi);
		System.out.println("4 : "+fou);
		System.out.println("5 : "+fif);
		System.out.println("6 : "+six);
		
	}

	// int r = (int)(Math.random()*10);

	/*
	 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
	 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 * 
	 * 
	 * 당신의 이름을 입력해주세요 : 
	 * 가위바위보 : 가위 
	 * 컴퓨터 : 가위
	 * 박신우 : 가위 비겼습니다.
	 * 
	 * 가위바위보 : 가위
	 * 컴퓨터 : 바위
	 * 박신우 : 가위 졌습니다 ㅠㅠ
	 * 
	 * 가위바위보 : 보
	 * 컴퓨터 : 바위 
	 * 박신우 : 보 이겼습니다 !
	 */
	public void method6() {
//		int a =(int)(Math.random());
		//마지막에 각 얼마나 이기고 지고 비겼는지 출력되게 나오게하기 지금은 가위바위보 할때마다 나옴
		int w = 0;
		int l = 0;
		int c = 0;

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		for (int i = 0;; i++) {

			System.out.print("가위바위보 : ");
			String p = sc.nextLine();

			int a = 0;

			switch (p) {
			
			case "가위":
				a = 0;				
				break;
				
			case "바위":
				a = 1;
				break;
				
			case "보":
				a = 2;
				break;
			}
			double random = Math.random() * 3;
			int ran = (int) random;
			String str = "";
			switch (ran) {
			case 0:
				str = "가위";
				break;

			case 1:
				str = "바위";
				break;

			case 2:
				str = "보";
				break;
			}
			System.out.printf("컴퓨터 : %s\n", str);

			if (ran == a) {
				System.out.printf("%s : %s\n", name, p);
				System.out.println("비겼습니다");
				++c;
			} else if (ran == (a + 1) || (ran == 0 && a == 2)) {
				System.out.printf("%s : %s\n", name, p);
				System.out.println("졌습니다. ㅠㅠ");
				++l;
			} else if ((ran == 2 && a == 0) || (ran == a - 1)) {
				System.out.printf("%s : %s\n", name, p);
				System.out.println("이겼습니다!");
				++w;
				System.out.printf("당신은 %d번 이기고, %d번 지고, %d번 비겼습니다. ", w, l, c);
				break;
		}
			
		
			
		}

	}
}

