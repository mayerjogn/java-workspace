package com.kh.example.practice3.model;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
	
	int lotto[] = new int[6] ;

		
	public String information() {
		 
		for (int i=0; i < 6; i++) {
			lotto[i]=(int)(Math.random()*45+1); 	
			
			//중복 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			
			}
		}
		return Arrays.toString(lotto);


		
	}
}
