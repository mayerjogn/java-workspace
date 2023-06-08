package com.youtube;

import com.youtube.controller.CommentController;
import com.youtube.model.Comment;

public class Application {

	public static void main(String[] args) {

		
		// 테스트 하는 공간이라 생각
		CommentController commentControl = new CommentController();
		// 컨트롤러들 불러오기
		//컨트롤러들 불러오기
		commentControl.addComment("test", "1234", new Comment()); //이런식으로 테스트
	}

}
