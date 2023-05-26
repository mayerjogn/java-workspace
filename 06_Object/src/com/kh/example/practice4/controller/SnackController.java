package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

public class SnackController {
	
	// 멤버변수 -> 보통 모델로 만들어놓은 클래스!
	Snack snack = new Snack();
	
	// 생성자
	public SnackController() {}
	
	// 메서드
	// 데이터를 setter를 이용해 저장하고 
	// 저장되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack viewSnack) {
		
		// snack은 controller에서 만든 임시 데이터 창고		
		// viewSnack은 Application에서 데이터를 담은 임시 데이터창고
		
//		String kind = viewSnack.getKind();
//		snack.setKind(kind); 아래꺼에 익숙해져보자 
		
		snack.setKind(viewSnack.getKind());
		snack.setName(viewSnack.getName());
		snack.setFlavor(viewSnack.getFlavor());
		snack.setNumOf(viewSnack.getNumOf());
		snack.setPrice(viewSnack.getPrice());
		
		return true;
	}		
	//controller에 저장된 데이터를 반환하는 메서드
	
	public Snack confirmData() { //더블체크 하는곳
		return snack;
		//return this.snack; 위랑 같음
	}
}




