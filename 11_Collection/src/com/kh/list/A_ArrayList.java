package com.kh.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.list.model.Person;

/*
 * 컬렉션 : 자바에서 제공하는 자료구조를 담당하는 프레임워크
 * 
 * - java.util 패키지에 컬렉션과 
 *   관련된 인터페이스와 클래스들이 포함되어 있음
 *   
 * - 컬렉션을 사용하면 데이터 추가, 삭제, 정렬 등의 처리가
 * 	 간단하게 해결되어 자료구조적 알고리즘을 구현할 필요가 없음    
 * */

/*
 * List 
 * - 중복 허용
 * - 순서 있음
 * */
public class A_ArrayList {

	public static void main(String[] args) {
		A_ArrayList a = new A_ArrayList();
		//a.method1();
		a.method2();
		//a.method3();
	}

	public void method1() {
		List list = new ArrayList();

		list.add("김민소");
		list.add("김민수");
		list.add("김준우");
		list.add("김준영");
		list.add("박주영");

		System.out.println(list);
	}

	public void method2() {
		/*
		 * 제네릭스(Generics) - 컴파일시 타입을 체크해 주는 기능 - <> 다이아몬드 연산자 사용
		 * 
		 * 컬렉션에서 사용하는 이유 - 명시된 타입의 객체만 저장하도록 제한을 두기 위해 사용 - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형
		 * 변환을 하지 않아도 됨
		 */

		// <>제네릭스로 타입을 지정해줌 같은 타입의 타입을 넣기위해서
		ArrayList<Person> list = new ArrayList/* <Person>, <> 셋중 아무거나 상관없음 */();

		// 1. add(E e) : 리스트 끝에 추가
		list.add(new Person("전현무", "삼성동", 45));
		list.add(new Person("남궁민", "서울숲", 45));
		list.add(new Person("이시언", "상도", 40));
		list.add(new Person("이제훈", "서울숲", 38));

		// 2. add(int index, E e) : 인덱스를 지정하여 해당 인덱스에 추가
		// 앞에 숫자는 들어갈 인덱스 자리
		list.add(1, new Person("유재석", "압구정", 50));
		list.add(3, new Person("강호동", "압구정", 52));

		// 3. set(int index, E e) : 해당 인덱스의 값을 변경할때 사용
		// 예제 3번째 인덱스값을 변경
		list.set(3, new Person("오은영", "강남", 57));

//		System.out.println(list);

		// 4. size() : 리스트 안에 몇 개의 데이터가 있는지 확인할때 사용
		System.out.println("사람 수 : " + list.size());

		// 5. remove(int index) : 해당 인덱스의 객체 삭제 할때 사용
		System.out.println(list.remove(0) + " 삭제");
		System.out.println(list);

		// 6. get(int index) : 해당 인덱스로 객체 가져오기 위해사용
		System.out.println(list.get(0));

		// 7. subList(int index1, int index2) : 추출해서 새로운 List로 반환하기 위해 사용
		List sub = list.subList(0, 2); // 0,2로 적어도 인덱스 0,1만 삭제됨 0,2사이의 인덱스를 삭제함
		System.out.println(sub);

		// 8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가하는 메서드
		list.addAll(sub);
		System.out.println(list);

		// 9. isEmpty() : 컬렉션이 비어있는지 묻는 메서드
		System.out.println("리스트가 비어있는지 : " + list.isEmpty());

		

		

		// 서울숲에 사는 사람들만 출력

		int sum = 0;
		for (Person p : list) {
		
		sum += p.getAge();
		}
		// for(int i=0; i<list.size() ; i++) {
		// sum+=list.get(i).getAge() ;

		
		// 저장된 사람들의 이름만 출력
		for (Person p : list) {
			System.out.println(p.getName() + " ");
		}

		System.out.println("평균 연령" + sum / list.size());
		
		// 리스트에 저장된 사람들의 평균 연령을 출력

		for (Person p : list) {
			if (p.getAddr().equals("서울숲")) {
				System.out.println(p);
			}
			
		}
		//나이 순서대로 출력 --> 이름순으로
		
		Collections.sort(list);
		System.out.println(list);

		 // 10. clear() : 싹 비우기
		list.clear();
		System.out.println("리스트가 비어있는지 : " + list.isEmpty());
		System.out.println(list);
		
	}
	public void method3() {
		// 11. indexOf(object o) : 해당 객체가 위치하는 인덱스값 반환
		List<String> list = new ArrayList<>();
		
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		System.out.println(list.indexOf("apple"));
		
		// 12. 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		
		// 13. 내림차순 정렬 내림차순 할땐 
		// sort로 오름차순 정렬 후 reverse 사용
		Collections.reverse(list);// 오름차순 정렬 후!
		System.out.println(list);
		
	}

}
