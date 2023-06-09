package com.kh.lambda.standard;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.model.Student;

/*
 * 
 * Predicate
 * - Predicate 함수적 인터페이스는 매개변수와 boolean 값을
 *   리턴하는 textXXX() 추상 메서드를 가지고 있다.
 *   
 * - textXXX() 추상 메서드는 매개값을 조사해서
 *    true/false를 리턴하는 역할을 한다. 
 * */
public class E_Predicate {

	public static void main(String[] args) {
		// 메인에서 모델 불러온다음 1,2로 선언
		Student student1 = new Student("구민지",20,"여자",80,70);
		Student student2 = new Student("윤종빈",16,"남자",100,90);
		
		E_Predicate e= new E_Predicate();
		//e.method1(student2);//studen2받고
		//e.method2(student1,student2);	
		 e.method3();
	}
	
	
	// Predicate<T> : 객체 T를 조사하는 역할
	public void method1(Student student) {//여기서도 불러옴
		
		Predicate<Student> pre = stu -> stu.getGender().equals("남자");
		System.out.println(student.getName()+ "은 남자입니까? : " + pre.test(student));
	}
	
	// BiPredicate<T, U> : 객체T와 U를 비교 조사  두개를 조사한다 생각
	public void method2(Student stu1, Student stu2) {
		BiPredicate<Student,Student> bp = (s1,s2)->s1.getGender().equals(s2.getGender()); 
		//첫번째 학생과 두번째 학생이 성별이 다른지 같은지 비교하는거
		System.out.println("두 학생의 성별이 동일한가? : " + bp.test(stu1, stu2));
	}
	
	// IntPredicate : int 값을 조사함
	public void method3() {
		IntPredicate ip = i-> i>100;// ip i가 100보다크다
		System.out.println(ip.test(90));// 작으니 fasle
		System.out.println(ip.test(101));// 크니 true
	}
}
