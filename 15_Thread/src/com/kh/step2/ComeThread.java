package com.kh.step2;

/*
 * 스레드 생성 방법
 * 
 * 2. Runnable 인터페이스를 구현하는 방법
 * 		- Runnable 인터페이스의 run() 메서드를 오버라이딩
 * 		- Thread 객체 생성 시 생성자의 Runnable 인터페이스를
 *  		 구현한 객체를 매개값으로 전달 후 start() 메서드 호출
 *  
 * * Thread, Runnable 두 방법 큰 차이는 없지만
 * 	 Runnable 인터페이스를 구현하는게
 * 	 코드의 일관성 유지와 재사용성이 높아 보다 객체지향적인 방법이다.
 * */

public class ComeThread implements Runnable{
	
	// 스레드가 작동하는 부분
	public void run() {
	
		/*
		 * sleep() : 지정된 시간동안 스레드를 멈추게 한다.
		 * - sleep()에 의해 일시정지 상태가 된 스레드는 지정된 시간이 다되거나 
		 *   interrupt()가 호출되면 interruptedException이 
		 *   발생되어 잠에서 깨어나 실행 대기 상태가됨 
		 * */
		
		for(int i=0; i<20; i++) {
			try {
				Thread.sleep(1000); // 1000=1초 
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: " + name+ ", "+i);
		}
		
	}
}
