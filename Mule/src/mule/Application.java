package mule;

import java.util.Scanner;

import mule.controller.PostController;
import mule.controller.UserController;

public class Application {
	private UserController uc = new UserController();
	private PostController pc = new PostController();
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Application app = new Application();
		app.mainMenu();
		
		// 어렵게 생각하지말고 간단하게 구현할수 있게되면 될거같은데		
	}

	public void mainMenu() {
		System.out.println("===== Mule =====");
		
		boolean check = true;
		while(check) {
			System.out.println("******메인 메뉴******");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. ID,PW 찾기");
			System.out.println("4. 계정 삭제");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 입력 : ");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				login();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 9:
				check = false;
				System.out.println("프로그램 종료");
				break;
			}
		}		
	}
}
