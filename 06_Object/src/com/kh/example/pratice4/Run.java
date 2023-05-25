package com.kh.example.pratice4;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;
import java.util.Scanner;

public class Run {
		
	public static void main(String[] args) {
		SnackController scr = new SnackController();
		Scanner sc = new Scanner(System.in);
		
//		Snack s = new Snack();
		
		System.out.println("종류 : ");
		String kind = sc.nextLine();
//		s.setKind(sc.nextLine());
		
		System.out.println("이름 : ");
//		s.setName(sc.nextLine());
		String name = sc.nextLine();
		System.out.println("맛 : ");
//		s.setFlavor(sc.nextLine());
		String flavor = sc.nextLine();
		System.out.println("개수 : ");
//		s.setNumOf(sc.nextInt());
//		s.setNumOf(Integer.parseInt(sc.nextLine()));
		int numOf=Integer.parseInt(sc.nextLine());
		System.out.println("가격 : ");
//		s.setPrice(sc.nextInt());
//		s.setPrice(Integer.parseInt(sc.nextLine()));
		int price=Integer.parseInt(sc.nextLine());
		
		Snack s = new Snack(kind,name,flavor,numOf,price);
//		scr.saveDate(s);
		if(scr.saveDate(s)) {
			System.out.println("저장 완료되었습니다");
			System.out.println(scr.confirmData());
		}

		
//		System.out.println(s);
//		s.getKind();
//		s.getName();
//		s.getFlavor();
//		s.getNumOf();
//		s.getPrice();
//		
//		System.out.println(s.getKind()+"("+ s.getName()+"-"+ s.getFlavor()+")"
//			+s.getNumOf()+"개"+ s.getPrice()+"원");
		
	}

}
