package com.几个反射类;

import java.lang.reflect.*;

public class ReflectTest {
	public static void main(String[] args) {
		Class c=null;
		try{
			c=Class.forName("com.Class类.Animal");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println("package  "+c.getPackage().getName()+";");//获得包名
		System.out.print(Modifier.toString(c.getModifiers())+" ");//获得修饰符
		System.out.print("class  "+c.getSimpleName()+" ");//得到源码中底层类的简称
		System.out.print("extends  "+c.getSuperclass().getName()+" ");//得到父类名称
		Class[] inters=c.getInterfaces();//返回接口数组
		if(inters.length>0){//如果接口数组长度大于0，输出接口名称
			System.out.print("implements");
			for(int i=0;i<inters.length;i++){
				System.out.print(inters[i].getName());
				if(i<inters.length-1){
					System.out.print(",");
				}
			}
		}
		System.out.println("{");
		printFields(c);//输出属性
		printConstructors(c);//输出构造方法
		printMethods(c);//输出方法
		System.out.println("}");
	}
	
	
	public static void printFields(Class c){//输出类属性的方法
		Field[] fs=c.getDeclaredFields();//获得所有自己类声明的属性
		for(int i=0;i<fs.length;i++){//依次输出修饰符、类型、名
			System.out.print("\t"+Modifier.toString(fs[i].getModifiers())+" ");
			System.out.print(fs[i].getType().getSimpleName()+" ");
			System.out.println(fs[i].getName()+";");
		}
	}
	
	
	
	public static void printConstructors(Class c){//输出类构造方法的方法
		Constructor[] cons=c.getDeclaredConstructors();//该类的所有构造方法
		for(int i=0;i<cons.length;i++){
			System.out.print("\t"+Modifier.toString(cons[i].getModifiers())+" ");
			System.out.print(c.getSimpleName()+"(");
			Class[] allParas=cons[i].getParameterTypes();//该构造方法的所有参数类型
			for(int j=0;j<allParas.length;j++){//输出该构造器所有参数列表
				System.out.print(allParas[j].getSimpleName()+"  args"+j);
				if(j<allParas.length-1){
					System.out.print(",");
				}
			}
			System.out.print(")");
			//该构造方法声明抛出的所有异常类型
			Class[] allExceptions=cons[i].getExceptionTypes();
			if(allExceptions.length>0){//判断该构造方法是否抛出异常
				System.out.print("throws  ");
				for(int k=0;k<allExceptions.length;k++){
					//输出所有异常类型
					System.out.print(allExceptions[k].getSimpleName());
					if(k<allExceptions.length-1){
						System.out.print(",");
					}
				}
			}
			System.out.println("{");
			System.out.println("\t\t... ...");
			System.out.println("\t}");
			System.out.println();
		}
	}
	
	
	
	/*输出该类所有方法的属性*/
	public static void printMethods(Class c){
		Method[] ms=c.getDeclaredMethods();//返回该类所有方法的数组
		for(int i=0;i<ms.length;i++){
			System.out.print("\t"+Modifier.toString(ms[i].getModifiers())+" ");
			System.out.print(ms[i].getReturnType().getSimpleName()+" ");
			System.out.print(ms[i].getName()+"(");
			Class[] allParas=ms[i].getParameterTypes();//该方法的所有参数类型
			for(int j=0;j<allParas.length;j++){//输出该方法的所有参数列表
				System.out.print(allParas[j].getSimpleName()+"  args"+j);
				if(j<allParas.length-1){
					System.out.print(",");
				}
			}
			System.out.print(")");
			//该方法声明抛出的所有异常类型
			Class[] allExceptions=ms[i].getExceptionTypes();
			if(allExceptions.length>0){//判断该方法是否抛出异常
				System.out.print("throws  ");
				for(int k=0;k<allExceptions.length;k++){
					//输出所有异常类型
					System.out.print(allExceptions[k].getSimpleName());
					if(k<allExceptions.length-1){
						System.out.print(",");
					}
				}
			}
			System.out.println("{");
			System.out.println("\t\t... ...");
			System.out.println("\t}");
			System.out.println();
		}
	}
}
