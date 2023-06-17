package com.kh.practice4;

import java.util.Scanner;

import com.kh.practice4.model.Member;
import com.kh.practice4.controller.MemberController;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		System.out.println("===== KH 사이트 =====");

		boolean check = true;
		while (check) {
			System.out.println("****** 메인 메뉴 ******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				joinMembership();
				break;
			case 2:
				login();
				break;
			case 9:
				check = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public void joinMembership() {

		/*
		 * 회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은 Member 객체에 담고 id와 객체는
		 * MemberController(mc)의 joinMembership()로 보냄
		 * 
		 * 받은 결과에 따라 true면 "성공적으로 회원가입 완료하였습니다." false면 "중복된 아이디입니다. 다시 입력해주세요." 출력
		 * 
		 */
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();

		if (mc.joinMembership(id, new Member(password, name))) {// Member 새로 선언

			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");

		}
	}

	public void login() {

		/*
		 * 아이디와 비밀번호를 사용자에게 받아 mc의 login() 메서드로 넘겨 줌 반환 값 있으면 "OOO님, 환영합니다!" 출력 후 로그인 된
		 * 화면으로(memberMenu()) 없으면 "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요." 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String name = mc.login(id, password);
		if (name != null) {
			System.out.println(name+"님, 환영합니다!");// 복습
			memberMenu();
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
		}
	}

	public void memberMenu() {
		boolean check = true;
		while (check) {
			System.out.println("****** 회원 메뉴 ******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				check = false;
				break;
			}
		}
	}

	public void changePassword() {

		/*
		 * 아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 changePassword()로 보냄 받은 결과 값이 true면
		 * "비밀번호 변경에 성공했습니다." false면 "비밀번호 변경에 실패했습니다. 다시 입력해주세요." 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호 : ");
		String oldPw = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String newPw = sc.nextLine();

		if (mc.changePassword(id, oldPw, newPw)) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		} else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}

	}

	public void changeName() {

		/*
		 * 아이디와 비밀번호를 받아 mc의 login()으로 넘겨 현재 저장되어 있는 이름을 받고 사용자에게 현재 저장되어 있는 이름을 출력하여
		 * 보여줌 변경할 이름을 받아 mc의 changeName()로 id와 함께 넘기고 "이름 변경에 성공하였습니다." 출력 만약
		 * login()로부터 저장되어 있는 이름을 받지 못 했다면 "이름 변경에 실패했습니다. 다시 입력해주세요" 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		String name = mc.login(id, password);//흠...
		if (name != null) {
			System.out.println("현재 설정된 이름 : "+name);
			System.out.println("변경할 이름 : ");
			String newName = sc.nextLine();
			mc.changeName(id, newName);
			System.out.println("이름 변경에 성공하였습니다.");
		} else {

		}
		System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");

	}

}
