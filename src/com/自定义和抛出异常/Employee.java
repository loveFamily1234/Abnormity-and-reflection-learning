package com.自定义和抛出异常;

public class Employee {//定义公开的职员类
	 String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	 //定义职员找报表的方法，找不到报表就报自定义异常
	public String getReport() throws ReportNotFoundException{
		if(Math.random()>0.7){//设定找到报表的几率是70%
			throw new ReportNotFoundException(name +"找不到报表！");
		}
		return name+"，找到报表了，快向领导报告！";
	}
}
