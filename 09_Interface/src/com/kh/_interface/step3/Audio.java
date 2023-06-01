package com.kh._interface.step3;

public class Audio implements RemoteControl,Searchable {

	private int volume;
	@Override
	public void setVolume(int Volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOULME) {
			this.volume = RemoteControl.MIN_VOULME;
			
		}else {
			this.volume = Volume;
			
		}
		System.out.println("현재 Audio 볼륨 : "+this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"을 연결합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

}
