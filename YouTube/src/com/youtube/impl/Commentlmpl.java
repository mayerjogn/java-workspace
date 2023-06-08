package com.youtube.impl;


import com.youtube.model.Comment;

// 팀 과제는 이 방식!
public interface Commentlmpl {
	
	// C : 댓글 작성 --> 로그인된 회원만 가능하게
	public void addComment(String id, String passowrd,Comment comment) ;
	// R : 댓글 1개 보기 Video에 여러개 보기를 담아놓음
	public Comment viewComment(int index) ;
	// U : 댓글 수정 --> 로그인 회원과 이 댓글을 작성한 작성자가 일치해야함
	public void updateComment(int index, Comment comment) ;
	// D : 댓글 삭제 --> 로그인 회원과 이 댓글을 작성한 작성자가 일치해야함
	public void deleteComment(int index); 

}
