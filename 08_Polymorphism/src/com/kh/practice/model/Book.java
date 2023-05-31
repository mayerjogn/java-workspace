package com.kh.practice.model;

public class Book {

	private String title; //도서명

	public Book() {}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
}
