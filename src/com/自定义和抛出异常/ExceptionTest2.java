package com.自定义和抛出异常;

//测试向上抛出方法和自定义异常
public class ExceptionTest2 {
	public static void main(String[] args) {
		Employee j=new Employee("姜午阳");//创建员工对象j
		Employee z=new Employee("赵二虎");//创建员工对象z
		Employee p=new Employee("庞青云");//创建员工对象p
		Employee[] e=new Employee[]{j,z,p};//创建员工数组
		Manager[] m=new Manager[]{new Manager(e)};//创建经理数组
		CFO cfo=new CFO(m);//创建CFO对象
		CEO ceo=new CEO(cfo);//创建CEO对象
		System.out.println(ceo.getReport());//CEO对象调用找报表的方法，输出
	}

}
