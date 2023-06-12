package com.kh.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * IO (Input / Output) 
 * - 입력과 출력
 * - 두 대상 간의 데이터를 주고 받는 것
 * - 입력 : 키보드, 파일, 네트워크(프로그래밍)
 * - 출력 : 모니터, 파일 ,네트워크(프로그래밍)
 * 
 * 스트림(Stream) 앞에 스트림과는 다름
 *  - 데이터를 운반하는 *연결 통로*
 *  - 연속적인 데이터 흐름을 물(stream)에 비유
 *  - 하나의 스트림으르 입출력을 동시에 수행할 수 없음(단방향 통신)
 *  - 입출력을 동시에 수행하려면, 2개의 스트림이 필요 (입력따로 출력따로)
 *  
 * */
public class KeyboardInputTest {

	// 키보드로 데이터를 읽어들여서 콘솔로 출력하는 로직
	public static void main(String[] args) {
		// 1. 스트림을 먼저 생성 : 입력 스트림만 필요
		InputStreamReader ir = new InputStreamReader(System.in);// 기반 스트림
		BufferedReader br = new BufferedReader(ir); // 보조 스트림  기반스트림을 보조스트림에 담아야함
		
		// 2. 읽어들인다 : readLine()
		try {
		
		 String line = br.readLine(); //try catch 해줘야함 
		 while(line!=null) {
			  // 3. 콘솔로 출력 : System.out.println();
			 System.out.println("Reading Data : " + line);
			 line = br.readLine();
		 }
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//반드시 finally에 해당 스트림을 담아줘야함
			try {// try catch로 안에서 또 잡음
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		

	}

}
