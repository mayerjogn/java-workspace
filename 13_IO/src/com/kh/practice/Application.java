package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.BookController;
import com.kh.practice.model.Book;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();
	}
	
	public void mainMenu() {
		
		boolean check = true;
		while(check) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				check = false;
				break;
			}
		}
		
	}
	
	public void fileSave() {
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		bc.fileSave(new Book(title, author, price));
	
	}
	
	public void fileRead() {
	
		for(Book book : bc.fileRead()) {
			System.out.println(book);
		}
			
	}

}
