package com.kh.practice3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice3.controller.FarmController;
import com.kh.practice3.model.Farm;
import com.kh.practice3.model.Fruit;
import com.kh.practice3.model.Nut;
import com.kh.practice3.model.Vegetable;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	public static void main(String[] args) {

		System.out.println("========== KH 마트 ==========");
		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		boolean check = true;
		try {

			while (check) {
				System.out.println("****** 메뉴 ******");
				System.out.println("1. 직원 메뉴");
				System.out.println("2. 손님 메뉴");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 선택 : ");
				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					adminMenu();
					break;
				case 2:
					customerMenu();
					break;
				case 9:
					check = false;
					System.out.println("프로그램 종료");
					break;
				default:
					throw new Exception(); // 메뉴 번호 잘못눌러서 다시 돌아갈때
				}
			}
		} catch (Exception e) { // throw가 이쪽으로 잡힘
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			mainMenu();
		}

	}

	public void adminMenu() throws Exception {

		boolean check = true;
		while (check) {

			System.out.println("****** 직원 메뉴 ******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 농산물 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				check = false;
				break;
			default:
				throw new Exception();
			}

		}
	}

	public void customerMenu() throws Exception /* throws Exception */ {

		boolean check = true;
		while (check) {
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			System.out.println("****** 고객 메뉴 ******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				check = false;
				break;
			default:
				throw new Exception();
			}

		}
	}

	public void addNewKind() {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 추가할 농산물의 이름과 수량도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 addNewKind()로 넘기고 전달받은 반환 값이 true면 "새 농산물이 추가되었습니다.",
		 * false면 "새 농산물 추가에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("추가할 이름 : ");
			String name = sc.nextLine();
			System.out.print("추가할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());

			boolean result = false; // 종류가 어려개일때 바깥에서 지정해버림

			switch (select) {
			case 1:
				result = fc.addNewKind(new Fruit(name), amount);
				break;
			case 2:
				result = fc.addNewKind(new Vegetable(name), amount);
				break;
			case 3:
				result = fc.addNewKind(new Nut(name), amount);
				break;
			default:
				throw new Error();// Exception();의 하위클래스
			}
			if (result) {
				System.out.println("새 농산물이 추가되었습니다.");
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
				addNewKind();
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			addNewKind();
		}

	}

	public void removeKind() {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 삭제할 농산물의 이름도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 removeKind()로 넘기고 전달받은 반환 값이 true면 "농산물 삭제에 성공하였습니다.",
		 * false면 "농산물 삭제에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("삭제할 이름 : ");
			String name = sc.nextLine();

			boolean result = false;
			switch (select) {
			case 1:
				result = fc.removeFarm(new Fruit(name));
				break;
			case 2:
				result = fc.removeKind(new Vegetable(name));
				break;
			case 3:
				result = fc.removeKind(new Nut(name));
				break;

			default:
				throw new Error();
			}
			if (result) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			} else {
				System.out.println("농산물 삭제에 실패하였습니다.");
				removeKind();
			}

		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}

	}

	public void changeAmount() {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 수정할 농산물의 이름과 수량도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 changeAmount()로 넘기고 전달받은 반환 값이 true면 "농산물 수량이 수정되었습니다.",
		 * false면 "농산물 수량 수정에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("수정할 이름 : ");
			String name = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());

			boolean result = false;
			switch (select) {

			case 1:
				result = fc.changeAmount(new Fruit(name), amount);
				break;
			case 2:
				result = fc.changeAmount(new Vegetable(name), amount);
				break;
			case 3:
				result = fc.changeAmount(new Nut(name), amount);
				break;
			default:
				throw new Error();
			}
			if (result) {
				System.out.println("농산물 수량이 수정되었습니다.");
			} else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
				changeAmount();
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}

	}

	public void printFarm() {

		// fc의 printFarm()의 반환 값을 이용하여 keySet()을 통해 "종류 : 이름(n개)" 형식으로 출력
		HashMap<Farm, Integer> hMap = fc.printFarm();
		Set<Farm> keys = hMap.keySet();
		Iterator<Farm> it = keys.iterator();

		while (it.hasNext()) { // 복습필수
			Farm key = it.next();
			System.out.printf("%s : %s(%d개)", key.getKind(), key.getName(), hMap.get(key));
		}

	}

	public void buyFarm() {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 구매할 농산물의 이름도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체를 fc의 buyFarm()으로 넘기고 전달받은 반환 값이 true면 "구매에 성공하였습니다.", false면
		 * "마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("구매할 것 : ");
			String name = sc.nextLine();

			boolean result = false;
			switch (select) {
			case 1:
				result = fc.buyFarm(new Fruit(name));
				break;
			case 2:
				result = fc.buyFarm(new Vegetable(name));
				break;
			case 3:
				result = fc.buyFarm(new Nut(name));
				break;
			default:
				throw new Error();
			}
			if (result) {
				System.out.println("구매에 성공하였습니다.");
			} else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
				buyFarm();
			}

		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}

	}

	public void removeFarm() {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 구매취소할 농산물 이름도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체를 fc의 removeFarm()으로 넘기고 전달받은 반환 값이 true면 "구매 취소에 성공하였습니다." false면
		 * "구매 목록에 존재하지 않습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 */
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("취소 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("구매 취소할 것 : ");
			String name = sc.nextLine();

			boolean result = false;
			switch (select) {
			case 1:
				result = fc.removeFarm(new Fruit(name));
				break;
			case 2:
				result = fc.removeFarm(new Vegetable(name));
				break;
			case 3:
				result = fc.removeFarm(new Nut(name));
				break;
			default:
				throw new Error();
			}
			if (result) {
				System.out.println("구매 취소에 성공하였습니다.");
			} else {
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
				removeFarm();
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}

	}

	public void printBuyFarm() {

		// fc의 printBuyFarm()의 반환 값을 이용하여 출력
		for(Farm farm : fc.printBuyFarm()) {
			System.out.println(farm.getKind()+" : "+farm.getName());
		}

	}

}
