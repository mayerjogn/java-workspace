package com.kh.example.practice1.model;


public class Member {
	
//	public String memberid= "lee";
//	public String memberpw="1234";
//	public String membername= "이지훈";
//	public int age=28;
//	public char gender='남';
//	public String phone= "010-1234-5678";
//	public String email="google.com" ;
	public String memberid;
	public String memberpw;
	public String membername;
	public int age;
	public char gender;
	public String phone;
	public String email ;
	
	public void changeName(String name) {//매개변수
		membername = name;
		
	
//	public void changeName(String name) {
//		
//		System.out.println(memberid);	
//		System.out.println(memberpw);
//		System.out.println(membername);
//		System.out.println(age);
//		System.out.println(gender);
//		System.out.println(phone);
//		System.out.println(email);
	}

	public void printName(String name) {
		membername = name;
	}

	

}

