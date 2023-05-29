package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class Tv extends Product {
	
	private int inch;

	public Tv() {
	}

	public Tv(String brand, String pCode, String name, int price, int inch) {
		super(brand, pCode, name, price);
		this.inch = inch;
	}

	@Override
	public String toString() {
		return super.toString()+ "Tv [inch=" + inch + "]";
	}

}
