package com.自定义和抛出异常;

//自定义异常类ReportNotFoundException ，有两个构造方法
public class ReportNotFoundException extends Exception{

	public ReportNotFoundException() {//空的构造方法
	}
	//自定义的异常类的构造方法，在有出错信息时创建异常对象
	public ReportNotFoundException(String mesg) {
		super(mesg);
	}
}
