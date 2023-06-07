package com.kh.practice3.model;

import java.util.Objects;

public class Farm {

	private String kind;
	private String name;

	public Farm() {
	}

	public Farm(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + ", name=" + name + "]";
	}
	
}
