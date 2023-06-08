package com.youtube.controller;

import java.util.ArrayList;
import java.util.List;

import com.youtube.model.Comment;

// 개인 과제는  이 방식으로 매개 변수를 뭘로 넣어야할지 모를때 아래처럼
public class CommentController {
	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();
	
	// C : 댓글 작성 --> 로그인된 회원만 가능하게
	public void addComment(String id, String passowrd,Comment comment) {//매개 타입은 자유
		
		if(uc.login(id,passowrd)) {
			comments.add(comment);
		}
	}
	// R : 댓글 1개 보기 Video에 여러개 보기를 담아놓음
	public Comment viewComment(int index) {//<-- index로 지정해서 get한것
		return comments.get(index);
//		if(uc.login(id, passowrd)) {
//			
//		}
	}
	// U : 댓글 수정 --> 로그인 회원과 이 댓글을 작성한 작성자가 일치해야함
	public void updateComment(int index, Comment comment) {
		comments.set(index, comment);
		
	}
	// D : 댓글 삭제 --> 로그인 회원과 이 댓글을 작성한 작성자가 일치해야함
	public void deleteComment(int index) {
		comments.remove(index);
	}
}
