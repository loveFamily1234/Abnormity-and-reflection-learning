package com.�Զ�����׳��쳣;

public class CFO {
	Manager[] ms;

	public CFO(Manager[] ms) {
		super();
		this.ms = ms;
	}
	public String getReport(){//CFO���ұ�������CFOֻ������ľ���Ҫ����
		try{
			return ms[0].getReport();
		}
		catch(ReportNotFoundException e){
			e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
		}
		return null;
	}

}
