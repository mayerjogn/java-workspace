package com.kh.step1.model;

public class Tv {

	public boolean power;
	public int channel = 20;
	
	public void power() { power = !power;}
	public void channelUp() {++channel;}
	public void channelDown() {--channel;}
	
	
}
