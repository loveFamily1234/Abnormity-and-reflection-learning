package com.�Զ�����׳��쳣;

public class Employee {//���幫����ְԱ��
	 String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	 //����ְԱ�ұ���ķ������Ҳ�������ͱ��Զ����쳣
	public String getReport() throws ReportNotFoundException{
		if(Math.random()>0.7){//�趨�ҵ�����ļ�����70%
			throw new ReportNotFoundException(name +"�Ҳ�������");
		}
		return name+"���ҵ������ˣ������쵼���棡";
	}
}
