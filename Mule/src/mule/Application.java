package mule;

import java.util.ArrayList;
import java.util.Scanner;

import mule.controller.PostController;
import mule.controller.UserController;
import mule.model.Post;
import mule.model.User;

public class Application {
	private UserController uc = new UserController();
	private PostController pc = new PostController();
	private Scanner sc = new Scanner(System.in);
	ArrayList<Post> postlist = new ArrayList<>();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();

		// 어렵게 생각하지말고 간단하게 구현할수 있게되면 될거같은데
	}

	public void mainMenu() {
		boolean check = true;

		try {
			System.out.println("===== Mule =====");
			while (check) {
				System.out.println("******메인 메뉴******");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 유저 메뉴");
				System.out.println("4. 포스트 메뉴");
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
				case 4:
					postMenu();
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
			System.out.println(/* "잘못 입력하셨습니다. : " + */ e.getMessage());
			mainMenu();
		}

	}

	public void signup() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		System.out.print("이름 : ");
		String name = sc.nextLine();

		if (uc.signup(id, new User(password, name))) {

		} else {
			System.out.println("중복된 아이디입니다.");
		}

	}

	public void login() {

		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		String name = uc.login(id, password);
		if (name != null) {
			System.out.println(id + "님, 환영합니다!");
			userMenu();
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}

	public void userMenu() {

		boolean check = true;
		while (check) {
			try {
				System.out.println("=====User menu=====");
				System.out.println("1. 아이디 변경");
				System.out.println("2. 계정삭제");
				System.out.println("3. 메인 메뉴");
				System.out.println("메뉴 번호 입력 :  ");
				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					changeId();
					break;
				case 2:
					deleteId();
					break;

				case 3:
					mainMenu();
					break;
				default:
					System.out.println("유효하지 않은 메뉴 번호입니다 다시 입력해주세요.");
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				userMenu();

			}
		}

	}

	public void changeId() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		String changeid = uc.login(id, password);
		if (changeid != null) {
			System.out.println("현재 ID : " + id);
			System.out.println("변경할 ID : ");
			String newid = sc.nextLine();
			uc.changeId(id, newid);
			System.out.println("ID 변경에 성공하였습니다." + "\n" + "새로운 ID : " + newid);

		} else {
			System.out.println("변경에 실패했습니다. 다시 입력하세요");
		}

	}

	public void deleteId() {
		System.out.println("삭제할 ID를 입력해주세요");
		String deleteid = sc.nextLine();

		System.out.println("삭제할 ID의 비밀번호를 입력해 주세요");
		String pw = sc.nextLine();
		uc.deleteProfile(deleteid, pw);
		System.out.println("ID를 삭제했습니다.");
		mainMenu();
	}
	// User 끝

	public void postMenu() throws Exception { //기타 치고와서도 오! 하고 떠오르는게 없어서 기능 몇개삭제했습니다..

		boolean check = true;
		while (check) {
			System.out.println("===== Post Menu ======");
			System.out.println("1. Post 업로드");
			System.out.println("2. 게시된 Post 찾기");
			System.out.println("3. Post 오름차순 정렬");
			System.out.println("7. 메인 메뉴");
			
			System.out.println("메뉴 번호 입력 : ");
		switch(Integer.parseInt(sc.nextLine())){
		case 1:
			 uploadPost(); // 포스트 업로드
			
			break;
		case 2:
			searchPost();
			break;
		case 3:
			descPost();			
			
		case 7 :
			mainMenu();
			break;
		
		default:
			System.out.println("유효하지 않은 메뉴 번호입니다 다시 입력해주세요.");
			throw new Exception();
		}
		}

	}

	public void uploadPost() {
		System.out.print("Post 제목 : ");
		String title = sc.nextLine();
		System.out.print("Post의 내용을 입력하세요 : ");
		String content = sc.nextLine();

		if (pc.uploadPost(new Post(content, title))) {
			System.out.println("Post가 추가됐습니다.");
		} else {
			System.out.println("Post 추가를 실패했습니다.");
		}
	}

	public void searchPost() {// 여긴 title이 먼저나오고 post가 뒤에 나왔으면 좋겠는데 어떻게해야할까요
		System.out.println("검색할 Post를 입력하세요");
		Post post = pc.searchPost(sc.nextLine());

		if (post != null) {
			System.out.println(post + "을 검색했습니다.");
		} else {
			System.out.println("검색하신 Post가 없습니다.");
		}
	}

	public void descPost() {
		System.out.println("======= Post 오름 차순 정렬 ========");
		ArrayList<Post> sortedPosts = pc.descPost();
		if(sortedPosts.isEmpty()) {
			System.out.println("게시된 Post가 없습니다.");			
		}else {
			for(Post post : sortedPosts) {
				System.out.println(post);
				
			}
		}
	}
}
