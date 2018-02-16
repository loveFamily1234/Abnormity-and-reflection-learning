package com.Class类;

public class Animal {
	private String name;
	private int age;
	 public Animal(){
		 System.out.println("无参构造方法创建了一个Animal对象");
	 }
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("有参构造方法创建了一个Animal对象");
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
