package com.�Զ�����׳��쳣;

public class Manager {//���徭����
	Employee[] es;

	public Manager(Employee[] es) {
		super();
		this.es = es;
	}
	public String getReport() throws ReportNotFoundException{
		StringBuffer sb=new StringBuffer();//StringBuffer��Ҫ���徭���仯���ַ���
		for(int i=0;i<es.length;i++){//���������е�ְԱ�ұ���
			sb.append(es[i].getReport());
		}
		return sb.toString();
	}

}
