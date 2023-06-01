package com.kh._abstract.step2;

public class PotatoPizza extends Pizza {

	public PotatoPizza(int price, String storeName) {
		this.price = price;
		this.storeName = storeName;
//protected는 부모클래스에서 자식클래스로 this.으로 불러올수있음
		// super넣어도 상관없긴함
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping...");
	}

}
