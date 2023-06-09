package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/*
 * 기본 집계
 *  - 최종 처리 기능으로 요소들을 개수, 합계, 
 *  평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할
 *  
 *  - count() : 요소의 개수를 리턴
 *  - sum () : 요소들의 합계를 리틴
 *  - average() : 요소들의 평균을 리턴
 *  - max() : 최대 요소를 리턴
 *  - min() : 최소 요소를 리턴
 *  - findFirst() : 첫 번째 요소를 리턴
 *  
 *  
 *  
 *  커스텀 집계
 *  - 스트림에서 기본 집계 메서드를 제공하지만
 *    다양한 집계 결과물을 만들 수 있드록 reduce() 메서드 제공
 * */
public class B_Aggregate {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6};
		long count = Arrays.stream(array).count();
		System.out.println("개수 : "+count);
		
		int sum = Arrays.stream(array).sum();
		System.out.println("합계 : " + sum);
		
		/*
		 * Optional 클래스
		 * - 스트림의 최종 결과 값을 저장하는 객체
		 * - 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고
		 *   값이 존재하지 않을 경우 디폴트 값을 설정할 수 있는 객체
		 *   
		 * - getXXX() : 저장되어 있는 값을 얻기 위해 사용
		 * 
		 * - isPresent() : 값이 저장되어 있는지 검사
		 * 
		 * - orElse() : get()과 동일하게 저장되어 있는 값을 얻어오는데
		 * 				값이 저장되어 있지 않을 경우 디폴트 값을 지정	
		 * */
		
		OptionalDouble average =Arrays.stream(array).average();
		
		System.out.println("평균 : "+average.getAsDouble());// get해야 앞에 Optional 안나옴
		
		OptionalInt max=Arrays.stream(array).max();
		if(max.isPresent()) {// if문 사용
			System.out.println("최대값 : "+max.orElse(0));
		}
		OptionalInt min=Arrays.stream(array).min();
		System.out.println("최소값 : "+ min.getAsInt());
		
		OptionalInt first=Arrays.stream(array).findFirst();
		System.out.println("첫번째 값 : "+first.getAsInt());
		
	}

}
