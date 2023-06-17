package mule.controller;

import java.util.HashMap;

import mule.model.User;


public class  UserController {

	private HashMap<String, User> map = new HashMap<>();
	

	public boolean signup(String id,User u) {//회원가입
		if(!map.containsKey(id)) {
			map.put(id, u);
			System.out.println("회원 가입이 완료되었습니다.");
			 System.out.println("등록된 회원 수: " + map.size());
			return true;
		}else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		return false;
	}
	
	public String login(String id, String password) {//로그인
		if(map.containsKey(id)&&map.get(id).getPassword().equals(password)) {
			

		return map.get(id).getName();
		
	}
	return null;
}

	public void changeId(String id, String newId) {
		
		map.put(id, new User(map.get(id).getPassword(),newId));
//		if(map.containsKey(id)) {
//			User user = map.get(id);
//			user.setName(newName);
	//		return true;
		}
	public boolean deleteProfile(String id, String pw) {//계정 삭제
		if(map.containsKey(id)&&map.get(id).getPassword().equals(pw)) {
			map.remove(id);
			System.out.println("등록된 회원 수: " + map.size());
			return true;// 계정 존재할경우 
		}
		return false;// 계정 없을 경우
	}

	
	
}

