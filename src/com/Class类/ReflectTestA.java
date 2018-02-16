package com.Class类;

import java.lang.reflect.*;

public class ReflectTestA {
	public static void main(String[] args) {
		Class c=null;
		try{
			c=Class.forName("com.Class类.Animal");
			//创建、加载类的对象
			Object obj=c.newInstance();//用类对象调用，只能调用无参的构造方法
			//用Constructor对象来实例化，可以调用指定参数的构造方法
			Constructor con=c.getDeclaredConstructor(String.class,int.class);
			Object obj2=con.newInstance("盼盼",8);//创建加载类的对象
			Field f=c.getDeclaredField("name");//调用对象属性name
			f.setAccessible(true);//设置可以访问私有成员
			String name=(String)f.get(obj2);//得到obj2的姓名
			System.out.println("obj2的name是："+name);
			f.set(obj2,"贝贝");//修改属性值
			Method m=c.getDeclaredMethod("move", String.class);//调用对象的方法
			m.setAccessible(true);//忽略所有访问权限，即可以访问私有成员
			Object o=m.invoke(obj2, "上海");//对指定参数的对象调用此方法的底层方法
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
