package com.kh.console;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// 간단하게 입력 출력 스트림 입력 보조 출력 보조 스트림 4개가 필요하다 생각

/* 얘는 좀 필요함 다운로드의 기본 로직 개발한다 생각
 * 
 * 바이트 기반 스트림 (기반 스트림들은 main에 해당한다보면됨)
 * - 데이터를 바이트(byte) 단위로 주고 받는다.
 * - 그림, 멀티미디어 등의 바이너르 데이터를 읽고 출력할 때 사용
 * - InputStream, OutputStream : 바이트 기반 입출력 스트름의 최상위 클래스
 * 
 * 보조 스트림
 * - 스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용
 * - 독립적으로 입출력을 수행할 수 없음
 * 
 * */
public class ByteStringTest {
	
	// 바이너리 데이터(이미지 파일)을 읽어서 파일로 출력하는 로직
	public static void main(String[] args) {
		
		String fileName = "src/bird.jpg"; //fileName은 보통 String 사용
		String outfileName = "src/bird_output.jpg";
		
		DataInputStream dis = null; //안에서 close를 못하니 밖에서 null로 초기화
		DataOutputStream dos = null;
		try {
			// 먼저 기반 스트림을 생성 
			// FileInputStream, FileOutputStream : 파일에 입출력을 하기 위한 스트림
			FileInputStream fis = new FileInputStream(fileName);
			FileOutputStream fos = new FileOutputStream(outfileName);
			
			// 기반 스트림을 이용해서 보조스트림 생성
			// DataInputStream, DataOutputStream : 기본형 타입으로 읽고 쓰는 보조 스트림
			
			 dis = new DataInputStream(fis);
			 dos = new DataOutputStream(fos);
			
			// 데이터를 읽어서 출력
			int data = 0;
			while((data = dis.read()) != -1) {// IO익셉션으로 try catch
				dos.write(data); //데이터를 읽어와 하나씩 정수값으로 출력 정수값이 -1이면 다 읽은것 
			}
	
		} catch(EOFException e) {// 입력 도중 예상외의 파일 종료됐을때의 예외
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} finally {// 필수
			try {
				dis.close();
				dos.close();// 같은 IO 익셉션이니 같이 담아버림
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
