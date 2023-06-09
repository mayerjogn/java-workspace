package com.kh.lambda.standard;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.model.Student;

/*
 * Function
 * - Function 함수적 인터페이스는 매개값과 리턴 값이 있는
 *   applyXXX() 추상 메서드를 가지고있다.
 *   applyXXX() 추상 메서드는 주로 매개값을 리턴 값으로
 *   			매핑(타입 변환)하는 역할
 * */
public class C_Function {

	public static void main(String[] args) {
		Student student = new Student("김경미",20,"여자",90,30);
		C_Function c = new C_Function();
	//	c.method1(student);
	//	c.method2();
		c.method3(student);//여기도 모델 클래스 student 담아야함
	}

	// Function<T, R> : 객체 T를 객체 R로 매핑
	public void method1(Student student) {//모델 클래스 student를 넘겨서 사용
//		Function<Student, String> function = s -> s.getName(); //기존
		Function<Student, String> function = Student::getName;// 이런식으로도 가능
		System.out.println("이름"+function.apply(student));
	}
	
	//BiFunction<T, U, R> : 객체T와 U를 객체 R로 매핑
	public void method2(){
		BiFunction<String,Integer,Student> biFunction = (name,age) -> new Student(name, age);
		System.out.println(biFunction.apply("최승환",15));
		
	}
	
	//ToIntFunction<T> : 객체T를 int로 매핑
	public void method3(Student student) {
		System.out.print("[수학점수] : ");
		printValue(student, s-> s.getMath()); //printValue 불러오고
		System.out.print("[영어점수] : ");
		printValue(student, s -> s.getEnglish());
		
		System.out.print("[합계] : ");
		printValue(student,s -> s.getEnglish()+ s.getMath());
		System.out.print("[평균] : ");
		printValue(student, s -> s.getEnglish()/s.getMath());
		
	}
	public void printValue(Student student, ToIntFunction<Student> function) 
	{ // 값을 출력하는 메서드 만들어서 쓰는거
		System.out.println(function.applyAsInt(student));// applyAsInt
		
	}
}
