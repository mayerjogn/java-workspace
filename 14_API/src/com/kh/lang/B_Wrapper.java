package com.kh.lang;

/*
 * Wrapper 클래스
 * - 기본 자료형을 객체로 포장해 주는 클래스
 * 
 * - 기본 자료형으로 사용해도 되지만 해당 기본 타입을 객체로 취급해서
 * 	 처리해야 하는 경우 사용한다. ex) Integer
 * 
 * - Boxing : 기본 자료형을 Wrapper 클래스로 포장해주는 것
 * 
 * - UnBoxing : Wrapper 클래스를 기본 자료형으로 변경해주는 것
 * */
public class B_Wrapper {
	public static void main(String[] args) {
		B_Wrapper b = new B_Wrapper();
		//b.method1();
		b.method2();
	}

	public void method1() {
		// Boxing : 기본 자료형 -> Wrapper 객체
		
		double dNum1 = 3.14;
		double dNum2 = 3.14;
		
// 1. 객체 생성을 통한 방법 (비권장 : Deprecated)
		Double double1 = new Double(dNum1);
		Double double2 = new Double(dNum2);
		
		System.out.println("dNum1 == dNum2 : " + (dNum1 == dNum2));// true
		System.out.println("dNum1 == double2 : " + (dNum1 == double2));// true
		System.out.println("double1 == ddouble2 : " + (double1 == double2));// false
		
		// 클래스에서 제공하는 메서드들을 사용 할 수 있음!
		System.out.println("equals : "+ double1.equals(double2));// true
		
		System.out.println();
		
//2. 객체를 직접 생성하지 않고 정적 메서드(valueOf)를 통한 방법
		Double double3 = Double.valueOf(1.11);
		Double double4 = Double.valueOf("1.11");
		
		System.out.println(double3);
		System.out.println(double4);
		
		System.out.println();
		
//3. Auto Boxing : 같은 타입만 가능	
		Integer integer = 5;
		Double double5 = 3.555;
		
		System.out.println(integer);
		System.out.println(double5);
		
		System.out.println();
		
//4. UnBoxing : Wrapper 객체 -> 기본 자료형으로 바꾸는것
	//1. Wrapper 객체 메서드를 통한 방법
		double dNum3 = double1.doubleValue();
		double dNum4 = double2.doubleValue();
		
	//2. Wrapper 클래스의 정적 메서드를 통한 방법	
		int iNum = Integer.parseInt("19");
		double dNum5 = double1.parseDouble("34.78");
		
	//3. Auto UnBoxing을 통한 방법
		double dNum6 = double1;
		double dNum7 = double3;
		
		//자바 1.9 버전 이후로는 Boxing이나 Unboxing 기능을 안쓰도록
		//Deprecated 되어 있음
	}
	
	
	// String 과 Wrapper 클래스 간의 변경
	public void method2() {
		
		String str1 = "10";
		String str2 = "3.14";
		
		System.out.println(str1 + str2); //103.14
		
// 1. 문자열을 기본 자료형으로 변경 : Wrapper 클래스에서 제공하는 parseXXX()를 사용한다
		int iNum = Integer.parseInt(str1);
		double dNum = Double.parseDouble(str2);
				
		System.out.println(iNum+dNum); //13.14 
		
// 2. 기본 자료형을 문자열로 변경 
// String의 valueOf() 메서드를 사용하는방법
		String str3 = String.valueOf(iNum);
		String str4 = String.valueOf(dNum);
		
		System.out.println(str3+str4); //문자 열이니 103.14
		
// Wrapper 클래스에서 제공하는 valueOf().toString() 메서드를 이용하는 방법
		String str5 = Integer.valueOf(iNum).toString();
		String str6 = Double.valueOf(dNum).toString();
		System.out.println(str5+str6);
	}
}
