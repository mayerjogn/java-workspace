package com.kh.map;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/*
	 * properties
	 * - HashMap 구버전인 Hashtable(Object, Object 정해진 것)을 상속받아 구현한것 
	 * - Properties는 (String, String) 형태로 단순화된 컬렉션 클래스
	 * - 주로 환경설정과 관련된 속성(property)를 저장하는데 사용
	 * */
public class B_Properties {

	public static void main(String[] args) {
		B_Properties b = new B_Properties();
		// b.method1();
		b.method2();

	}

	public void method1() {
		Properties prop = System.getProperties();

		// prop에 저장된 요소들을 Enumeration을 이용해서 출력 (Iterator와 용도가 비슷함)
		// 컬렉션 프레임워크 이전 구버전이므로 Iterator가 아닌 Enumeration
		Enumeration en = prop.propertyNames();

		while (en.hasMoreElements()) {// hasNext와 용도가 비슷함
			String key = (String) en.nextElement(); // String으로 담게 형 변환
			String value = prop.getProperty(key).trim(); // key값을 부르면 value값을 가져옴
			System.out.println(key + " : " + value);

		}

	}

	public void method2() {
		
		Properties prop = new Properties();
		
		// 순서 유지 X, 키값 중복 X  HashSet과 같음
		// prop에 키와 값(key,value) 저장법과 가져오는법
		prop.setProperty("List", "ArrayList");//저장법들
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map","HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("Set"));//가져오는법들
		System.out.println(prop.getProperty("Stack","값이 없음")); // 키값에 없는걸 넣었을 경우 null 출력 
		//"값이 없음"을 넣으면 "값이 없음"출력
		
		Set<Entry<Object,Object>>entrySet=prop.entrySet();
		Iterator<Entry<Object,Object>> it =entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
	}

}
