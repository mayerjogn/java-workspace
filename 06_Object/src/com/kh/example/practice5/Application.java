package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;
import com.kh.example.practice5.model.Employee;



public class Application {
	
	 Scanner sc = new Scanner(System.in);
	
	Employee viewEmployee = new Employee();
	
	EmployeeController employeeController = new EmployeeController();
	
	public static void main(String[] args) {
			
		Application app = new Application();
		
		boolean check = true;
		while(check) {
			int select = app.employeeMenu();
			switch(select) {
			case 1:
				app.insertEmp();
				break;
			case 2:
				app.updateEmp();
				break;
			case 3:
				app.printEmp();
				break;
			case 9:
				check = false;
				System.out.println("프로그램을 종료합니다");
				break;			
			}
			
		}
	}
	public int employeeMenu() {
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요 : ");
		return Integer.parseInt(sc.nextLine());
		

	}	
		
		
		


	public void insertEmp() {
		
		System.out.print("사원 번호 : ");
		int empNo = Integer.parseInt(sc.nextLine());
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("추가 정보를 더 입력하시겠습니까(y/n)");
		String add = sc.nextLine();
		
		if(add.equals("y")) {
			System.out.print("사원 부서 : ");
			String dept=sc.nextLine();
			
			System.out.print("사원 연봉 : ");
			int salary = Integer.parseInt(sc.nextLine());
			
			System.out.print("보너스율 : " );
			double bonus = Double.parseDouble(sc.nextLine());
			
			employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
		}else { // n인 경우
			employeeController.add(empNo, name, gender, phone);
		}
	}
	public void updateEmp() {
		
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원연봉");
		System.out.println("3. 보너스율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요");
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) {
		case 1:
			System.out.print("전화 번호 입력 : ");
			String phone = sc.nextLine();
			employeeController.modify(phone);
			break;
		case 2:
			System.out.print("사원 연봉 입력 : ");
			int salary = Integer.parseInt(sc.nextLine());
			employeeController.modify(salary);
			break;
		case 3:
			System.out.print("보너스율 입력 : ");
			double bonus = Double.parseDouble(sc.nextLine());
			employeeController.modify(bonus);
			break;
		case 9:
			break;
		}
	}
	public void printEmp() {
		
		System.out.println(employeeController.info());
	}
		}

	
	
		
		
		



	
//		System.out.println("1. 사원 정보 추가"+"\n"+"2. 사원 정보 수정"+"\n"+"3. 사원 정보 출력"+"\n"+"9. 프로그램종료");
//		
//		System.out.print("메뉴 번호를 입력하세요 : ");
//			int menu = sc.nextInt();							
//		if(menu==1) {
//			System.out.print("사원 번호 : ");
//			int empNo = sc.nextInt();
//		}else if() {
//			System.out.print("사원 이름 : ");
//			String name = sc.nextLine();			
//		}else if() {
//			System.out.print("사원 성별 : ");
//			


