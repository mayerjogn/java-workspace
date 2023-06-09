package com.kh.stream.intermeiate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.model.Student;

/*
 * 정렬
 * - 스트림은 최종 처리가 되기 전 중간 단계에서 요소들을
 *   정렬해서 최종 처리 순서를 변경할 수 있다.
 *   
 * - Stream<T>은 요소 객체가 Comparable 인터페이스를
 *   구현해야 정렬할 수 있다.
 *   
 * - IntStream, DoubleStream, LongStream은 요소를
 *   오름차순으로 정렬한다. 		  
 * */
public class B_Sorted {

	public static void main(String[] args) {

		B_Sorted b = new B_Sorted();
		//b.method1();
		b.method2();
	}

	// 요소가 기본 자료형일 때
	public void method1() {
		
		// 오름차순 정렬 sorted()
		Arrays.stream(new int[] {3,5,1,2,4}).sorted().forEach(value -> System.out.print(value+ " "));
		
		System.out.println();
		
		// 내림차순 정렬 boxed().sorted(Comparator.reverseOrder()
		Arrays.stream(new int[] {3,5,1,2,4}).boxed().sorted(Comparator.reverseOrder())
		.forEach(value -> System.out.print(value + " "));
	}
	
	// 요소가 객체일 때
	public void method2() {
		List<String> names = Arrays.asList("김민수","구관원","임지우","박승환");
		
		// Comparable 인터페이스 구현 내용에 따라서 오름차순 정렬
		// 스트링 객체 오름차순 정렬
		
		names.stream()
		.sorted().forEach(name-> System.out.print(name+" "));
		
		System.out.println();
		
		// Comparable 인터페이스 구현 내용에 반대로 정렬 (내림차순 정렬)
		
		names.stream()
		.sorted(Comparator.reverseOrder()).forEach(name-> System.out.print(name+" "));
		
		System.out.println();
		
		// Student 나이순 정렬
		List<Student> students = Arrays.asList(
		new Student("김민수",18,"남자",80,70),
		new Student("구관원",12,"남자",90,50),
		new Student("임지우",16,"여자",80,90),
		new Student("박승환",11,"남자",70,100)
		);
	students.stream().sorted().forEach(student->System.out.println(student));//.sorted() 중요
		
	}
	
	
}
