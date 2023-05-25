package com.youtube.model;

import java.util.Date;
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
	public Video() {
	}
	public Video(String title, String comment, Date uploadAt, int views, String imgurl, String fileurl) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.views = views;
		this.imgurl = imgurl;
		this.fileurl = fileurl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getFileurl() {
		return fileurl;
	}
	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}
	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", views=" + views
				+ ", imgurl=" + imgurl + ", fileurl=" + fileurl + "]";
	}
	
	
	
	}
	
	
		
	


