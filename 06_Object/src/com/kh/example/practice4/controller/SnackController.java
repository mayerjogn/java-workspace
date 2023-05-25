package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

/*
 * controller : 사용자가 화면에서 요청한 부분을 처리하는 기능 담당
 * 이때 처리 후에 결과를 여기서 출력하는게 아니라 결과값을 
 * 다시 view(ex:run 애플리케이션 등등) 에
 * 반환하여 view에 처리하도록 해야함 
 * */

public class SnackController {

	private Snack s = new Snack();
	
	public SnackController() {}
	
	// 데이터를 setter를 이용해 저장하고 저장 되었다는 
	// 결과를 반환하는 메서드
	
	public boolean saveDate(Snack s) {
		
		this.s.setKind(s.getKind());
		this.s.setName(s.getName());
		this.s.setFlavor(s.getFlavor());
		this.s.setNumOf(s.getNumOf());
		this.s.setPrice(s.getPrice());
		
		return true;
	}
	
	//저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		return this.s;
	}
}
