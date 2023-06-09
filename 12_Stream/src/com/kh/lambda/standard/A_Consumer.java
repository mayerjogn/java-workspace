package com.kh.lambda.standard;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/* 표준 함수적 인터페이스
 *
 * - 자바 8부터 빈번히 사용되는 함수적 인터페이스는 
 * 	 java.util.function 표준 API 패키지로 제공
 * 
 * - 자바 8부터 추가되거나 변경된 API는 이 표준 
 *   함수적 인터페이스들을 매개 타입으로 사용
 *  
 * - 용도에 따라 크게 Consumer, Supplier,
 *    Function,Operator,Predicate로 구분  
 *    
 *  Consumer
 *  - Consumer 함수적 인터페이스는 리턴 값이 없는 
 *    accept() 추상 메서드를 가지고 있다. 
 *  - accept() 추상 메서드는 단지 매개값을 소비하는 역할을 한다.
 *    
 *     
 * */

public class A_Consumer {

	public static void main(String[] args) {

		A_Consumer a = new A_Consumer();
		//a.method1();
		//a.method2();
		//a.method3();
		a.method4();
	}
	// Consumer<T> : T 객체를 받아 소비 제네릭스를 기본으로할땐 T로 명시 제네릭스에 받은 객체에 따라서 사용가능
	public void method1() {
		/*
		Consumer<String> consumer = (String str)->{
			System.out.println(str);
		}; //<- 얘도 ; 필요함
		
		*/
		
		Consumer<String> consumer = str -> System.out.println(str);
		consumer.accept("Consumer는 한 개의 매개값(제네릭으로 지정된 타입)을 받아서 소비한다.");// 여기가 필요함
	}
	// BiConsumer<T,U> : T와 U 객체를 받아 소비  제네릭스에 받은 객체에 따라서 사용가능
	public void method2() {
		BiConsumer<String,String> biConsumer=(str1,str2)-> 
		System.out.println(str1+str2); 
		biConsumer.accept("BiConsumer는", "두 개의 매개값을 받아서 소비한다");//각 각 st1, str2로 넘어감
			
		
	}
	
	public void method3() {
	/*
	 * IntConsumer : int 값을 받아 소비
	 * 
	 * LongConsumer : long 값을 받아 소비
	 * 
	 * DoubleConsumer : double 값을 받아 소비
	 * 
	 * 사용법은 셋다 같음 숫자만 가능
	 * */	
		
		DoubleConsumer dConsumer = value -> 
		System.out.println("DoublConsumer는 하나의 double 타입의 값을 받아서 소비한다 : "+value);
		dConsumer.accept(3.14);
	}

	// ObjectConsumer
	public void method4() {
		/*
		 * ObjectConsumer<T> : T 객체와 int값을 받아 소비
		 * ObjectConsumer<T> : T 객체와 long값을 받아 소비
		 * ObjectConsumer<T> : T 객체와 double값을 받아 소비 
		 * */
		ObjIntConsumer<String> objIntConsumer = (str,value)->{
			System.out.println("ObjIntConsumer는 두개의 매개값 받아서 소비한다.");
			System.out.println(str+value);
		};
		objIntConsumer.accept("Java", 11);//accept에서 str value 값 지정해야함
	}
}
