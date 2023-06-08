package mule.controller;

import mule.model.User;

public class  UserController {

	User user = null;

	public boolean login(String id, String password) {//로그인
		if(user!=null&&user.getId().equals(id)&&user.getPassword().equals(password)) {
			

		return true;
		
	}
	return false;
}

	public void signup(User user) {//회원가입
		this.user=user;
	}

	public User find() {
		if(login(user.getId(),user.getPassword())) {// id pw 찾기
			return user;
		}
		return null;
		
	}
	public void deleteProfile(String id) {//계정 삭제
		if(user.getId().equals(id)) {
			user = null;
		}
	}

	
	
}

