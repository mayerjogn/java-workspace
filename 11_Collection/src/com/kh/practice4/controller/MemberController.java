package com.kh.practice4.controller;

import java.util.HashMap;

import com.kh.practice4.model.Member;

public class MemberController {

	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		
		/*
		 * 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		 * 있다면 false 값 반환
		 * */
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}

		return false;
	}
	
	public String login(String id, String password) {
		
		/*
		 * 
		 * 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와 
		 * 사용자가 입력한 비밀번호가 같은지 비교
		 * 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		 * 
		 * */
		if(map.containsKey(id) && map.get(id).getPassword().equals(password)) {				

			return map.get(id).getName();
		}
		
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
		/*
		 * 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
		 * 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
		 * */
		if(map.containsKey(id)&&map.get(id).getPassword().equals(oldPw)) {
			map.put(id,new Member(newPw,map.get(id).getName()));//복습혀라 Member변수 아예 새로 선언
			return true;
		}
		
		return false;
	}
	
	public void changeName(String id, String newName) {
		
		/*
		 * 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		 * 
		 * */
		
		//if(map.containsKey(id)&&map.get(id).getName().equals(id)) {
			map.put(id,new Member(map.get(id).getPassword(), newName)); //복습혀라 Member변수 아예 새로 선언
		//}
	}
	
}
