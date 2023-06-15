package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL(Uniform Resource Locator)
 * - 인터넷에 존재하는 서버들의 자원에 접근할 수 있는 주소
 * 
 * http://www.youtube.com/results?search_query=여행 
 * 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링
 * - 프로토콜 : 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신규약 (https)
 * - 호스트명 : 자원을 제공하는 서버의 이름 (www.youtube.com)등등
 * - 포트번호 : 통신에 사용되는 서버의 포트번호 입력 (443 유튜브)
 * - 경로명 : 접근하려는 자원이 저장된 서버상의 위치(results)
 * - 쿼리(query) : ? 이후의 부분 (search_query=여행)등등			 
 * */

public class URLTest {

	public static void main(String[] args) {

		URLTest u = new URLTest();
		//u.method1();
		u.method2();
		
	}
	
	
	
	public void method1() {
		
		try {
			URL url = new URL("http://www.youtube.com/results?search_query=여행 ");
			System.out.println("url.getProtocol() : "+url.getProtocol());//프로토콜
			System.out.println("url.getHost() : "+url.getHost());//호스트명
			System.out.println("url.getDefaultPort() : "+url.getDefaultPort());//포트번호
			System.out.println("url.getFile() : "+url.getFile());//파일 results? 이후 부분
			System.out.println("url.getPath() : "+url.getPath());//경로명
			System.out.println("url.getQuery() : "+url.getQuery());//쿼리
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void method2() {
		BufferedReader input = null;
		try {
			URL url = new URL("https://iei.or.kr");
			input = new BufferedReader(new InputStreamReader(url.openStream())); 
			
			String line = "";
			while ((line = input.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
