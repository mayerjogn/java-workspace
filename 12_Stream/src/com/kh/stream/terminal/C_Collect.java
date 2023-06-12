package com.kh.stream.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.kh.model.Student;

/*
 *  수집
 * - 최종 처리 기능으로 필터링 또는 맵핑한 요소들을 새로운 컬렉션으로
 * 	 담아서 리턴하는 collect()를 제공한다.
 *  
 * */
public class C_Collect {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("김종휘",17,"남자",90,100),
				new Student("박승환",16,"남자",70,80),
				new Student("박진실",15,"여자",80,90),
				new Student("김민수",14,"남자",100,70),
				new Student("문병철",18,"남자",90,60)
				);
		
		// List 컬렉션으로 수집 -> 수학 점수가 90점 이상인 사람들만
		
		List<Student>list = students.stream()
		.filter(student -> student.getMath() >= 90)
//		.collect(Collectors.toList());//<-- Collectors.toList() 사용시 List로 반환됨
		.collect(Collectors.toCollection(()-> new ArrayList<>()));
		//List에서 Array List로 반환한것  supplier 사용 후 람다식으로 
		//이렇게는 아예 new ArrayList<>로
		System.out.println(list);
		
		// Set 컬렉션으로 수집 -> 중학생이신 분들만
		
		Set<Student> set = students.stream().filter(student->student.getAge()<=16)
	//	.collect(Collectors.toSet()); // 바꾸는건 항상 컬렉트 Set으로 반환시킴
		.collect(Collectors.toCollection(()-> new HashSet<>()));//HashSet으로 HashSet자주씀
		System.out.println(set);
		
		// Map 컬렉션으로 수집
		
		Map<String, Integer> map = students.stream()
		.collect(Collectors.toMap(student->student.getName(),student->student.getAge()));
		
		HashMap<String, Integer>hMap =(HashMap<String, Integer>)map;  //강사님은 이 방식을 더 추천
		System.out.println(hMap);
	}

}
