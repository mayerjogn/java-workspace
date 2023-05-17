package com.kh.pracitce;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice();
		
		cp.method1();
		cp.method2();
		
	}
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자 : ");
		String name = sc.next();
				
		//흠 "여기엔 뭘넣어야 입력하는 문자대로 바뀔까요 unicode : "
		char ch = name.charAt(0);
		System.out.println(" unicode : " + (int)ch); 
		System.out.println(" unicode : " + ((int)ch+1) );//이것도 확실 맞는지 모르겠어요 이렇게 하면 유니코드 마지막에 그냥 +1만 되는거 아닌가요..
		
		//System.out.println();
		//char ch2 = name.charAt(0);
		//System.out.print("unicode : " + (int)ch2 );
		
		//char ch1 = name.charAt(0);
		
		//System.out.print("unicode :  ");
		
		//char ch2 = name.charAt(0);
		
		
		
		//System.out.printf("%s :  " +(int)ch1  );
		//System.out.println();
		//System.out.printf("%s :  " +(int)ch2 );
		
		
		//char ch1 = name.charAt(0);
		//char ch2 = name.charAt(0);
		//int num1 = 'A';
		//int num2 = 'B';
			
		//System.out.println("A unicode : " + (int) 'A');
		//System.out.println("B unicode : " + (int) 'B');
		//System.out.println("A unicode : " + 'A');
		//System.out.println("B unicode : " + 'B');
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
				
		float f1 =(a+b+c);
		float f2 = (f1/3);
		
		
		System.out.printf("총점 : %.f\n " + f1);
		System.out.printf("평균 : %.2f\n " + f2);
		
	    //암만 생각해봐도 소수점 자리 자르는건 이거같은데  총점이랑 평균 나올때 이런 오류가떠요
		/*Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '.'
		at java.base/java.util.Formatter.parse(Formatter.java:2750)
		at java.base/java.util.Formatter.format(Formatter.java:2671)
		at java.base/java.io.PrintStream.format(PrintStream.java:1209)
		at java.base/java.io.PrintStream.printf(PrintStream.java:1105)
		at com.kh.pracitce.CastingPractice.method2(CastingPractice.java:64)
		at com.kh.pracitce.CastingPractice.main(CastingPractice.java:12)*/

	}
	
}
