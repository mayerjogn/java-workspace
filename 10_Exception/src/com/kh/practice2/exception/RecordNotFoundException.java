package com.kh.practice2.exception;

public class RecordNotFoundException extends Exception {

	public RecordNotFoundException() {
		this("This is RecordNotFoundException...");
	}
	public RecordNotFoundException(String message) {
		super(message);
	}
}
