package com.youtube.model;

import java.util.Date;
import java.util.List;
//alt + shift + s
public class Video {
/*
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 * */
	private String title;
	private String comment;
	private Date uploadAt;
	private int views; //count;
	private String imgurl;
	private String fileurl;
	private String desc;
	private char kind;// shorts & video 둘 중 하나
	
	private List<Comment> comments;
	private Category category;
	}
	
	
		
	


