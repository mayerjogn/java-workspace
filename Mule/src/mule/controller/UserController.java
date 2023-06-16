package mule.controller;

import java.util.HashMap;

import mule.model.User;


public class  UserController {

	private HashMap<String, User> map = new HashMap<>();
	

	public boolean signup(String id, User u) {//회원가입
		if(!map.containsKey(id)) {
			map.put(id, u);
			return true;
		}
		return false;
	}
	
	public String login(String id, String password) {//로그인
		if(map.containsKey(id)&&map.get(id).getPassword().equals(password)) {
			

		return map.get(id).getName();
		
	}
	return null;
}

	public void changeId(String id , String newName) {
		
		if(map.containsKey(id)) {
			User user = map.get(id);
			user.setName(newName);
	//		return true;
		}
	//	return false;
		
	}
	public boolean deleteProfile(String id) {//계정 삭제
		if(map.containsKey(id)) {
		//	User user = map.get(id);
			
			map.remove(id);
			return true;// 계정 존재할경우 
		}
		return false;// 계정 없을 경우
	}

	
	
}

