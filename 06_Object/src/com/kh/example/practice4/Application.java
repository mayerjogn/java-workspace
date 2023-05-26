package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Application {

	public static void main(String[] args) {
		
		// ------------------화면----------------------
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");;
		int price = Integer.parseInt(sc.nextLine());
		// ------------------------------------------- 입력한후 아래로 요청하게됨
		
		// 데이터를 서버한테 요청하는 곳!
		SnackController snackControl = new SnackController();
		Snack viewSnack = new Snack(kind,name,flavor,numOf,price);
		snackControl.saveData(viewSnack); // true
		
		// -------------------------------------------
		
		//서버한테 응답받아 데이터 결과를 받아서 다시 화면으로 돌아온 곳!
		System.out.println("저장 완료되었습니다.");
		System.out.println(snackControl.confirmData());
		

	}

}
