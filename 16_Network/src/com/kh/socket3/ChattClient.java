package com.kh.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ChattClient {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("192.168.10.12", 60000);
			System.out.println("서버와 연결이되었습니다..");
			
			Thread sendThread = new SendThread(socket);
			sendThread.start();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(br!=null) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			System.out.println("서버 종료.....!");
		}

	}
}

	// 쓰레드로 쪼갠거 입력하는 부분을 빼놓음
	class SendThread extends Thread {

		Socket socket;
		Scanner sc = new Scanner(System.in);

		
		public SendThread(Socket socket) {
			this.socket=socket;
		}
		
		public void run() {
			try {
				PrintStream ps = new PrintStream(socket.getOutputStream());
				
				while(true) {
					ps.println(sc.nextLine());
					ps.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
