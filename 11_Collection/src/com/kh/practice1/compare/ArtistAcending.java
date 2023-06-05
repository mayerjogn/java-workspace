package com.kh.practice1.compare;

import java.util.Comparator;

import com.kh.practice1.model.Music;

public class ArtistAcending implements Comparator <Music>{//Comparator랑 Comparable 차이 생각하기

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getArtist().compareTo(o2.getArtist());
	}

	






	

}
