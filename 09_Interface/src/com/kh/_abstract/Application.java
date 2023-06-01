package com.kh._abstract;

import com.kh._abstract.step1.BasketBall;
import com.kh._abstract.step1.FootBall;
import com.kh._abstract.step1.Sports;
import com.kh._abstract.step2.BulgogiPizza;
import com.kh._abstract.step2.PineApplePizza;
import com.kh._abstract.step2.Pizza;
import com.kh._abstract.step2.PotatoPizza;

/*
 * 추상 클래스(Abstract Class)
 * 
 * [표현법]
 * 
 * [접근제어자] abstract class 클래스명{...}
 * 
 * - 미완성 클래스로 추상 메서드를 포함한 클래스
 * - 미완성 클래스이기 때문에 new 연산자를 
 *   통해서 객체를 생성할 수 없다.
 * - 일반적인 멤버(필드,메서드,)도 포함이 가능(필드 + 메서드 + 추상메서드)
 * - 추상 클래스로 객체를 생성할 수 없지만 
 *   참조형 변수의 타입으로 사용가능
 * - 상속 관계로 구성되어 있으면 다형성 적용이 가능   
 *   
 *  추상 메서드(Abstract Method)
 *  
 *  [표현법] 
 *   
 *  [접근제어자] abstract 반환형 메서드명([매개변수,...)]
 *  
 *  - 미완성 메서드로 중괄호({})가 구현되지 않는 메서드
 *  - 추상 클래스를 상속받는 자식 클래스에서 반드시 오버라이딩(재정의)
 *  - 오버라이딩(재정의) 해주지 않으면 컴파일 에러가 발생
 *  - 자식 클래스에 강제성을 부여할 수 있음!
 * */

public class Application {

	public static void main(String[] args) {
	
		//Sports sport = new Sports(); <-- 생성 불가!
		Sports[] sports = new Sports[2];
		sports[0] = new BasketBall(5);
		sports[1] = new FootBall(11);
		
		for(Sports s : sports) {
			s.rule();
		}
		System.out.println();
		
		Pizza[]pizza = {new BulgogiPizza(32900,"피자헛"),new PotatoPizza(27900,"도미노피자"),
				new PineApplePizza(23000,"피자알보로")};
		for(Pizza p : pizza) {
			p.makePizza();
		}
	}

}
