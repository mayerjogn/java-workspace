package com.kh.example.practice;

import java.util.Scanner;

import com.kh.example.practice1.model.Member;

public class Run {

	public static void main(String [] args) {
		
		Member mb = new Member();
//		mb.printName(name);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 이름 > ");
		String name = sc.nextLine();
		
		mb.changeName(name);
		mb.printName(name);
	//	mb.changeName("a");
	
	
}
}
//	
//	public String memberid;
//		public String memberpw;
//		public String membername;
//		public int age = 28;
//		public char gender = '남';
//		public String phone;
//		public String email

