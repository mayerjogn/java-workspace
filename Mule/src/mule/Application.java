package mule;

import java.util.Scanner;

import mule.controller.PostController;
import mule.controller.UserController;
import mule.model.User;

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

		try {
			System.out.println("===== Mule =====");

			boolean check = true;
			while (check) {
				System.out.println("******메인 메뉴******");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 유저 메뉴");
				System.out.println("9. 프로그램 종료");
				System.out.println("메뉴 번호 입력 : ");
				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					signup();
					break;
					
				case 2:
					login();
					break;
					
				case 3:
					userMenu();
					break;
														
				case 9:
					check = false;
					System.out.println("프로그램 종료");
					break;
					
					default:
						System.out.println("잘못입력하셨습니다.");
						throw new Exception();
						
				}
			}
		} catch (Exception e) {
			System.out.println(/*"잘못 입력하셨습니다. : " +*/ e.getMessage());
			mainMenu();
		}

	}
	public void signup() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("연락처 : ");
		String phone = sc.nextLine();
		
		System.out.print("닉네임 : ");
		String nickname = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		if(uc.signup(id, new User(id,password))) {// password 왜 오류뜨냐 흠
			
			System.out.println("회원가입이 완료되었습니다.");
		}else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		
	}

	public void login() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String name = uc.login(id, password);
		if(name != null) {
			System.out.println("이지훈님, 환영합니다!");
			try {
				userMenu();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}
	
	public void userMenu() throws Exception { 
//Farm은 컨트롤러에 안만들어서 새로 만든거고 이거는 컨트롤러 다만들어놨잖아 그걸 어떻게 불러오냐고 돌대가리새끼야

		boolean check = true;
		while(check) {
			try {
			System.out.println("=====User menu=====");
			System.out.println("1. 아이디 변경");
			System.out.println("2. 계정삭제");
			System.out.println("9. 메인 메뉴");
			System.out.println("메뉴 번호 입력 :  ");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				uc.changeId(null, null);
//				System.out.println("새로운 아이디 입력 : ");
//				String newName = sc.nextLine();
//				uc.changeId(String Id, newName);
				break;
			case 2:
				uc.deleteProfile(null);
				break;
			case 9 :
				check = false;
				break;
			default:
				System.out.println("유효하지 않은 메뉴 번호입니다 다시 입력해주세요.");
				throw new Exception();
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				userMenu();
				
			}
		}
		
	}

	public void postMenu() throws Exception {

		boolean check = true;
		while (check) {
			System.out.println("===== Post Menu ======");
			System.out.println("1. Post 업로드");
			System.out.println("2. Post 수정");
			System.out.println("3. Post 삭제");
			System.out.println("4. Post 보기");
			System.out.println("5. Post 찾기");
			System.out.println("6. Post 오름차순 정렬");
		switch(Integer.parseInt(sc.nextLine())){
		case 1:
			pc.uploadPost(null);
			break;
		case 2:
			pc.updatePost(0, null);
			break;
		case 3:
			pc.deletePost(null);
			break;
		case 4:
			pc.viewPost(0, null);
			break;
		case 5:
			pc.searchPost(null);
			break;
		case 6:
			break;
		default:
			System.out.println("유효하지 않은 메뉴 번호입니다 다시 입력해주세요.");
			throw new Exception();
//			System.out.println("유효하지 않은 메뉴 번호입니다 다시 입력해주세요.");
//			break;
		}
		}
	}

	}


