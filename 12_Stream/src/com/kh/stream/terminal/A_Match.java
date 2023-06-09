package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.List;

import com.kh.model.Student;

/*
 * 매칭 : 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할
 * 
 * - allMatch() : 모든 요소들이 매개 값으로 주어진
 *            Predicate의 조건을 만족하는지 조사하는 역할
 *            
 * - anyMatch() : 최소한 한 개의 요소가 매개 값으로 주어진 
 * 				Predicate의 조건을 만족하는지 조사하는 역할
 * 
 * - noneMatch() : 모든 요소에서 매개 값으로 주어진
 * 				Predicate의 조건을 만족하지 않는지 조사하는 역할				    
 * */
public class A_Match {

	public static void main(String[] args) {

		A_Match a = new A_Match();
		//a.method1();
		a.method2();
	}

	public void method1() {
		
		boolean result = false; //result false 일단 초기화
		int [] values = {2,4,6};
		
		result = Arrays.stream(values).allMatch(value-> value%2 == 0);//모든 조건이 2의 배수인지 all
		System.out.println(result);
		
		result = Arrays.stream(values).anyMatch(value-> value%3 ==0);//하나라도 3의 배수인지 any
		
		System.out.println(result);
		
		result = Arrays.stream(values).noneMatch(value-> value % 5==0);//5배수가 아닌지 none
		System.out.println(result);
	}
	
	public void method2() {
		boolean result = false;
		List<Student> students = Arrays.asList(
				new Student("홍수민",7,"남자",50,80),
				new Student("강원구",2,"남자",90,90),
				new Student("박진실",15,"여자",80,50),
				new Student("이주연",18,"여자",60,80),
				new Student("최준혁",14,"남자",70,90)
				);
		// 스트림을 이용하여 나이가 10살 이상인 학생들이 모두 여자인지 확인하시오.
	     result = students.stream().filter(student->
		student.getAge()>=10).allMatch(student->student.getGender().equals("여자"));
	     	     		
		System.out.println(result);
		// 남학생들 중에 평균이 70점 이상인 학생이 한 명이라도 존재하는지 확인하시오.
		result = students.stream().filter(student->student
				.getGender().equals("남자")).anyMatch(student-> (student.getMath()+student.getEnglish())/2>=70);
				
				System.out.println(result);
	}
}
