package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.practice3.model.Farm;

public class FarmController {

	private HashMap<Farm, Integer> hMap = new HashMap<>(); // 마트에서 농산물 저장용
	private ArrayList<Farm> list = new ArrayList<>(); // 고객이 구매한 농산물 저장용
	// Farm - 종류, 이름 / Integer - 수량

	public boolean addNewKind(Farm f, int amount) {
		// containsKey() : map에 key가 존재하는가
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		// f와 amount를 각각 키와 값으로 저장 후 true 반환

		// 존재할 경우 false 반환

		Set<Farm> keys = hMap.keySet();
		Collection<Integer> col = hMap.values();
		try {
			for (Farm key : keys) {

				if (hMap.containsValue(key)) {
					return false;
				} else {
					hMap.put(f, amount);
				}
			}

		} catch (Exception e) {
			return true;
		}
//		for (Farm key : keys) {
//			if (hMap.containsValue(key)) {
//				return false;
//			} else {
//				hMap.put(f, amount);

		return false;

	}

	public boolean removeKind(Farm f) {

		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// hMap에 f 삭제 후 true 반환

		// 존재하지 않을 경우 false 반환
		Set<Farm> keys = hMap.keySet();
		for (Farm key : keys) {
			if (hMap.get(key).equals(key)) {
				return false;
			} else {
				hMap.remove(f);
				return true;
			}

		}
		return false;
	}

	public boolean changeAmount(Farm f, int amount) {

		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// f와 amount 저장 후 true 반환

		// 존재하지 않을 경우 false 반환
		Set<Farm> keys = hMap.keySet();
		
		for (Farm key : keys) {
		hMap.replace(key, amount);
			if (hMap.get(key).equals(key)) {
				return true;
			} else {
				 ((List<Farm>) hMap).set(amount, f);
				return false;
			}

		}
		return false;
	}

	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}

	// 고객 관련 기능 ------------------------------------------------------------

	public boolean buyFarm(Farm f) {

		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환

		// 존재하지 않으면 false 반환
		ArrayList<Farm> keys = list.keySet();
		for (int i =0; list.size()<=1;  i++) {
			if(list.containsKey(i));{
				return list == null;			
		}else {
			
			return false;
		}
		}
		
	


		return false;
	}

	public boolean removeFarm(Farm f) {

		// 전달 받은 f가 list에 존재할 때
		// list에 f 삭제, 그리고 hMap에 f 수량 1 증가, true 반환

		// 아니면 false 반환
		Set<Farm> keys = list.keySet();
		for (Farm key : keys) {
			if (list.get(key).equals(key)) {
				return false;
			} else {
				list.remove(f);
				return true;
			}

		}
		return false;
	}

	

	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
