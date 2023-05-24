package mull.model;

import java.util.Scanner;

public class User {
	
	public String id;
	public String password;
	public String phone;
	public String nickname;
	public String name;
	
	
	public boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id1 = "lee";
		id1 = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		int pw1 = 1111;
		pw1 = sc.nextInt();
		if ("lee".equals(id1) && pw1 == 1111) {
			System.out.print("로그인 성공");

		}else {
			System.out.println("로그인 실패");
			
		}
		return  login();
	}
	public boolean signup() {
		return false;
	}

	public User find() {
		return null;
	}

	public User naverlogin() {
		return null;
	}

	public User kakaologin() {
		return null;
	}

}
