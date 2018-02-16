package com.����������;

import java.lang.reflect.*;

public class ReflectTest {
	public static void main(String[] args) {
		Class c=null;
		try{
			c=Class.forName("com.Class��.Animal");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println("package  "+c.getPackage().getName()+";");//��ð���
		System.out.print(Modifier.toString(c.getModifiers())+" ");//������η�
		System.out.print("class  "+c.getSimpleName()+" ");//�õ�Դ���еײ���ļ��
		System.out.print("extends  "+c.getSuperclass().getName()+" ");//�õ���������
		Class[] inters=c.getInterfaces();//���ؽӿ�����
		if(inters.length>0){//����ӿ����鳤�ȴ���0������ӿ�����
			System.out.print("implements");
			for(int i=0;i<inters.length;i++){
				System.out.print(inters[i].getName());
				if(i<inters.length-1){
					System.out.print(",");
				}
			}
		}
		System.out.println("{");
		printFields(c);//�������
		printConstructors(c);//������췽��
		printMethods(c);//�������
		System.out.println("}");
	}
	
	
	public static void printFields(Class c){//��������Եķ���
		Field[] fs=c.getDeclaredFields();//��������Լ�������������
		for(int i=0;i<fs.length;i++){//����������η������͡���
			System.out.print("\t"+Modifier.toString(fs[i].getModifiers())+" ");
			System.out.print(fs[i].getType().getSimpleName()+" ");
			System.out.println(fs[i].getName()+";");
		}
	}
	
	
	
	public static void printConstructors(Class c){//����๹�췽���ķ���
		Constructor[] cons=c.getDeclaredConstructors();//��������й��췽��
		for(int i=0;i<cons.length;i++){
			System.out.print("\t"+Modifier.toString(cons[i].getModifiers())+" ");
			System.out.print(c.getSimpleName()+"(");
			Class[] allParas=cons[i].getParameterTypes();//�ù��췽�������в�������
			for(int j=0;j<allParas.length;j++){//����ù��������в����б�
				System.out.print(allParas[j].getSimpleName()+"  args"+j);
				if(j<allParas.length-1){
					System.out.print(",");
				}
			}
			System.out.print(")");
			//�ù��췽�������׳��������쳣����
			Class[] allExceptions=cons[i].getExceptionTypes();
			if(allExceptions.length>0){//�жϸù��췽���Ƿ��׳��쳣
				System.out.print("throws  ");
				for(int k=0;k<allExceptions.length;k++){
					//��������쳣����
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
	
	
	
	/*����������з���������*/
	public static void printMethods(Class c){
		Method[] ms=c.getDeclaredMethods();//���ظ������з���������
		for(int i=0;i<ms.length;i++){
			System.out.print("\t"+Modifier.toString(ms[i].getModifiers())+" ");
			System.out.print(ms[i].getReturnType().getSimpleName()+" ");
			System.out.print(ms[i].getName()+"(");
			Class[] allParas=ms[i].getParameterTypes();//�÷��������в�������
			for(int j=0;j<allParas.length;j++){//����÷��������в����б�
				System.out.print(allParas[j].getSimpleName()+"  args"+j);
				if(j<allParas.length-1){
					System.out.print(",");
				}
			}
			System.out.print(")");
			//�÷��������׳��������쳣����
			Class[] allExceptions=ms[i].getExceptionTypes();
			if(allExceptions.length>0){//�жϸ÷����Ƿ��׳��쳣
				System.out.print("throws  ");
				for(int k=0;k<allExceptions.length;k++){
					//��������쳣����
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
