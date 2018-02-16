package com.自定义和抛出异常;

public class Manager {//定义经理类
	Employee[] es;

	public Manager(Employee[] es) {
		super();
		this.es = es;
	}
	public String getReport() throws ReportNotFoundException{
		StringBuffer sb=new StringBuffer();//StringBuffer主要定义经常变化的字符串
		for(int i=0;i<es.length;i++){//经理让所有的职员找报表
			sb.append(es[i].getReport());
		}
		return sb.toString();
	}

}
