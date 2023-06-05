package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice1.compare.ArtistAcending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList();

	public boolean addList(Music music) {

		return list.add(music);

	}

	public boolean addAtZero(Music music) {
		try {
			list.add(0, music);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public ArrayList<Music> printAll() {
		return list;

	}

	public Music searchMusic(String title) {
		for (Music music : list) {// Music을 music으로 초기화
			if (music.getTitle().contains(title)) {// 검색할때 한자라도 같은걸 뽑히게 contains 사용한것
				return music;
			}

		}
		return null;

	}

	public Music removeMusic(String title) {
		/*
		 * for (Music music : list) { 방법 1 if (music.getTitle().equals(title)) {
		 * 
		 * list.remove(music); return music; }
		 * 
		 * }
		 */
		for (int i = 0; i < list.size(); i++) { // 방법 2
			if (list.get(i).getTitle().equals(title)) {
				return list.remove(i); // return 타입이 Music
			}
		}
		return null;

	}

	public Music setMusic(String title, Music music) {

		for (Music m : list) {// 향상된 for문으로 Muisc m으로 새로 초기화
			if (m.getTitle().equals(title)) {// 정확한 title을 찾아야하니까 equals 사용한것
				return list.set(list.indexOf(m), music);//indexOf(); 찾아보기
			}
		}
		return null;
	}

	public ArrayList<Music> ascTitle() {
		ArrayList<Music> list =(ArrayList<Music>)this.list.clone();//배열 복사 사용
		// 오름 차순
		Collections.sort(list, new TitleAscending()); // new로 새로 초기화
		return list;

	}

	public ArrayList<Music> descArtist() {
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();//배열 복사 사용
		// 내림 차순
		Collections.sort(list, new ArtistAcending().reversed()); // new로 새로 초기화
		return list;

	}
}