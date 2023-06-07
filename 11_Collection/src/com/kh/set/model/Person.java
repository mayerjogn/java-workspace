package com.kh.set.model;

import java.util.Objects;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	public Person () {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Person o) {
//		return this.age == o.age ?0 : this.age>o.age? 1: -1;
//		return (this.age - o.age);// 나이 오름 차순 정렬
//		return (this.age - o.age)* -1;// 나이 내림 차순 정렬
//		return this.name.compareTo(o.name); // 이름 오름 차순
		return this.name.compareTo(o.name)*-1;// 이름 내림 차순
	}
	
}
