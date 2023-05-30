package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;
import com.kh.array.practice2.model.Member;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {

		boolean check = true;

		while (check) {
			System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
			
			System.out.println("현재 등록 회원수는" + mc.count + "명입니다.");			
			if(mc.count<3) {
				System.out.println("1. 새 회원 등록");
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 구조 : ");
			
			switch (Integer.parseInt(sc.nextLine())) {
			
			case 1:
				this.insertMember();
				break;
								
			case 2:
				this.updateMember();
				break;
			case 3:
				this.printAll();
				break;
			case 9:
				check = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
			}
		}

	

	public void insertMember() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();

		if (mc.checkId(id) != -1) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			this.insertMember();
		} else {
			// mc.checkId 활용 중복된 아이디 체크
			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			System.out.print("이메일 : ");
			String email = sc.nextLine();

			System.out.print("성별 : ");
			char gender = sc.nextLine().charAt(0);

			System.out.print("나이 : ");
			int age = Integer.parseInt(sc.nextLine());

			// 1번의 경우
			// mc.insertMember(id, name, password, email, gender, age);

			// 2번의 경우 - 생성자로 값 임시 저장해서 넘기고 있음!
			Member m = new Member(id, name, password, email, gender, age);

			// 2번의 경우 - setter로 값을 임시 저장해서 넘기기!

//		Member m= new Member();
//		m.setId(id);
//		m.setName(name);
//		m.setPassword(password);
//		m.setEmail(email);
//		m.setGender(gender);
//		m.setAge(age);
			mc.insertMember(m);
		}

	}

	public void updateMember() {

		System.out.print("수정할 회원의 아이디: ");
		String id = sc.nextLine();
		if(mc.checkId(id)==-1) {
			System.out.println("회원 정보가 없습니다.");
			return;
		}else if(mc.checkId(id)!=-1) {
		
		
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();

		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();

		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();

		mc.updateMember(id, name, email, password);

	}
	}
	public void printAll() {

		Member[] mArr = mc.printAll();
		for (Member m : mArr) {
			if (m != null)
				System.out.println(m);
		}

	}
}
