package com.kh.condition;

import java.util.Scanner;

public class test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("중간 고사 점수 : ");
    	int s1 = sc.nextInt();
    	System.out.print("기말 고사 점수 : ");
    	int s2 = sc.nextInt();
    	System.out.print("과제 점수 : ");
    	int s3 = sc.nextInt();
    	System.out.print("출석 회수 : ");
        int s4 = sc.nextInt();
                            
        double a = s1*0.2;
        
        double b = s2*0.3;
        
        double c = s3*0.3;
        
//        double d = s4%30;
        
        double x = a+b+c+s4;
        
        System.out.println("=======결과======");	        	
        if(x >= 70 && s4 >= 20){        	
        	System.out.println("중간 고사 점수(20) : " + a);        	        	
        	System.out.println("기말 고사 점수(30) : " + b);         	         	 
        	System.out.println("과제 점수(30) : " + c);        	       	 
        	System.out.println("출석 점수(20) : " + s4);
        	System.out.println("총점 : "+(a+b+c+s4));
        	System.out.println("PASS");
        	
        }else if(x < 70&&s4>=20){ 
          	 System.out.println("FAIL[점수 미달]"+(a+b+c+s4));
        }else if(s4<20){
        	System.out.println("FAIL[출석횟수 부족]" + s4 ); 
        		}
        else {
        	System.out.print("FAIL[점수 미달]"+(a+b+c+s4)+"\n"+"FAIL[출석횟수 부족]" + s4);
        }
        	}
}
	



