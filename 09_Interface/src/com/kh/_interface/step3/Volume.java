package com.kh._interface.step3;

public interface Volume {

	// 인터페이스 = 추상 메서드 + 상수
	
	//public static final 이 상수 int 앞에 숨겨져 있는것
	int MAX_VOLUME = 10;
	int MIN_VOULME = 0;
	
	// 인터페이스에서 메서드는 무조건 추상 메서드!
	
	/*public abstract*/void setVolume(int Volume);
}
