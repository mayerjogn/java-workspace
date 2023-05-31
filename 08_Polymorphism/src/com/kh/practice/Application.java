package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.Book;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();

	}
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age =Integer.parseInt(sc.nextLine());
		
		lc.insertMember(name, age);
		
		boolean check = true;
		while(check) {
			System.out.println("====메뉴====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 검색하기");
			System.out.println("3. 도서 대여하기");
			System.out.println("4. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				this.searchBook();
				break;
			case 3:	
				this.rentBook();
				break;
			case 4:
				check=false;
				break;
			}
		}
	}
	
	// 검색할 책 (LiraryController의 searchBook 메서드 이용)
	public void searchBook() {
		
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		System.out.print(lc.searchBook(keyword));
		
	}
	
	// 빌릴 책 관련 기능이 들어가 있는(LiraryController의 rentBook 메서드 이용)
	public void rentBook() {
		
		Book[] books =lc.viewBooks();
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i+ "번 도서 : "+ books[i]);
		}
		System.out.print("대여할 도서 번호 선택 : ");
		int select = Integer.parseInt(sc.nextLine());
		
		if(lc.rentBook(select)) {
			System.out.println("성공적으로 대여되었습니다.");
		}else {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}
	}
}
