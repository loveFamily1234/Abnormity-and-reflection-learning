package com.Class��;

public class Animal {
	private String name;
	private int age;
	 public Animal(){
		 System.out.println("�޲ι��췽��������һ��Animal����");
	 }
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("�вι��췽��������һ��Animal����");
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
	private void move(String place){
		System.out.println(name+"move to"+place);
	}
}
