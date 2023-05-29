package com.kh.composite;

/*
 * 클래스 간의 관계 : 상속 vs 포함
 * - 상속 관계 : ~은 ~이다. (is-a 관계)
 * - 포함 관계 : ~은 ~을 가지고 있다.(has-a 관계)
 * - 자바는 단일상속만 허용
 * - 클래스 간의 관계를 많이 맺을수록 재사용을 
 *   높이고 관리하기 쉽다.
 * */

public class Customer {//extends Object
	
	protected String name;          // 고객 이름
	protected String grade;        // 고객 등급
	protected int bonusPoint;     // 포인트 적립
	protected double bonusRatio; //보너스 적립 비율
	
	Product product; // 포함관계 명시
	
	public Customer() {}
	
	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";// 기본 등급		
		this.bonusRatio = 0.01; // 포인트 기본 적립 비율
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override //<-- 애노테이션! '이 메서드는 재정의된 메서드이다.' 라고 
			  //    컴파일러에 명확히 알려주는 역할
	public boolean equals(Object obj) {// 이 부분 맞춰 작성해야함
		Customer c = (Customer) obj; // 이건 바로 다음에 배울 '다형성'! 형변환 처럼 사용
		return this.name == c.name;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;
	}
	
}
