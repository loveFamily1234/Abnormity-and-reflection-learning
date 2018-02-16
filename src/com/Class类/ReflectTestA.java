package com.Class��;

import java.lang.reflect.*;

public class ReflectTestA {
	public static void main(String[] args) {
		Class c=null;
		try{
			c=Class.forName("com.Class��.Animal");
			//������������Ķ���
			Object obj=c.newInstance();//���������ã�ֻ�ܵ����޲εĹ��췽��
			//��Constructor������ʵ���������Ե���ָ�������Ĺ��췽��
			Constructor con=c.getDeclaredConstructor(String.class,int.class);
			Object obj2=con.newInstance("����",8);//����������Ķ���
			Field f=c.getDeclaredField("name");//���ö�������name
			f.setAccessible(true);//���ÿ��Է���˽�г�Ա
			String name=(String)f.get(obj2);//�õ�obj2������
			System.out.println("obj2��name�ǣ�"+name);
			f.set(obj2,"����");//�޸�����ֵ
			Method m=c.getDeclaredMethod("move", String.class);//���ö���ķ���
			m.setAccessible(true);//�������з���Ȩ�ޣ������Է���˽�г�Ա
			Object o=m.invoke(obj2, "�Ϻ�");//��ָ�������Ķ�����ô˷����ĵײ㷽��
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
