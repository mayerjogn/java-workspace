package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {
// 로또 번호 : 한번만 무작위 6개 번호가 무작위
// 내 번호 : 랜덤으로 6개 번호가 랜덤으로~ 계속~
// 로또번호랑 일치할 때까지 --> equals()
	public static void main(String[] args) {
		Application app = new Application();
		app.method1();
		app.method2();
	}

	// TreeSet
	public void method1() {
		TreeSet<Integer> lotto = new TreeSet<>();

		// size() 사용
		for (int i = 0; lotto.size() < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			lotto.add(random);
		}

		int count = 0;
		while (true) {
			TreeSet<Integer> myLotto = new TreeSet<>();

			// 내 번호가 랜덤 6개 숫자 추출
			// 내 번호는 반복문 안에 반복문

			while (myLotto.size() < 6) {
				int choose = (int) (Math.random() * 45) + 1;
			}

			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호 : " + myLotto);
			System.out.println("횟수 : " + count);
			count++;
			// 내 번호랑 로또 번호가 일치한지 : equals() --> break!
			if (lotto.equals(myLotto)) {
				System.out.println("횟수 : " + count);
				break;
			}

		}
	}

	// 횟수
	public void method2() {
		HashSet<Integer> lotto = new HashSet<>();

		// size()
		for (int i = 0; lotto.size() < 6; i++) { // 이거 안됨!
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
		}

		List lottoList = new ArrayList(lotto);
		Collections.sort(lottoList);

		// 내 번호는 반복문 안에 반복문
		int count = 0;
		while (true) {
			HashSet<Integer> myLotto = new HashSet<>();

			// 내 번호가 랜덤 6개 숫자 추출
			while (myLotto.size() < 6) {
				int choose = (int) (Math.random() * 45) + 1;
				myLotto.add(choose);
			}

			List myLottoList = new ArrayList(myLotto);
			Collections.sort(myLottoList);

			System.out.println("로또 번호 : " + lottoList);
			System.out.println("내 번호 : " + myLottoList);
			count++;

			// 내 번호랑 로또 번호가 일치한지 : equals() -> break!
			if (lottoList.equals(myLottoList)) {
				System.out.println("횟수 : " + count);
				break;
			}

		}

	}

}
