package com.kh.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 소켓(Socket)
// - 네트워크 상의 돌아가는 두 개의 프로그램 간 양방향 통신 (창구 역할을함)
public class ChattServer {

	public static void main(String[] args) {

		// 클라이언트가 보낸 메시지를 받아서 콘솔창에 받은 메시지를 출력하는 역할
		
		// 서버측 로직
		
		try {
			// 1. ServerSocket 생성(port)
			ServerSocket server = new ServerSocket(60000);
			System.out.println("Server Ready.....");
			
			// 2. 클라이언트가 서버에 접속하면 accept로 받아서 Socket을 하나 리턴
			Socket s = server.accept();
			System.out.println("Client Socket... Returning...");
			
			// 3. 소켓으로부터 스트림 리턴
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String line = null;
			while((line = br.readLine())!=null) {
				System.out.println("Client가 보낸 메시지 : "+line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Client와의 연결이 끊어졌습니다..");
		}
		
	}

}
