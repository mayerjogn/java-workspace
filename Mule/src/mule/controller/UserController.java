package mule.controller;

import java.util.ArrayList;
import java.util.HashMap;

import mule.model.User;

public class  UserController {

	private HashMap<String, User> map = new HashMap<>();
	private ArrayList<User> list = new ArrayList<>();
	

	public boolean signup(String id, User u) {//회원가입
		if(!map.containsKey(id)) {
			map.put(id, u);
			return true;
		}
		return false;
	}
	
	public String login(String id, String pw) {//로그인
		if(map.containsKey(id)&&map.get(id).getPassword().equals(pw)) {
			

		return map.get(id).getName();
		
	}
	return null;
}

	public void chaneName(String id , String newName) {
		
		map.put(id,new User(map.get(id).getPassword(),newName));
		

		
	}
	public boolean deleteProfile(User u) {//계정 삭제
		if(list.contains(u)) {
			list.remove(u);
			
			return true;// 계정 존재할경우 
		}
		return false;// 계정 없을 경우
	}

	
	
}

