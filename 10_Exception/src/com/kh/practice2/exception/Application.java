package com.kh.practice2.exception;

public class Application {

	public static void main(String[] args) {
		
		try {
			throw new DuplicateNameException();
			
		}catch(DuplicateNameException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new RecordNotFoundException();
			
		}catch(/*RecordNotFound*/Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
