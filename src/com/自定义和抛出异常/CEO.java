package com.�Զ�����׳��쳣;

public class CEO {
	CFO cfo;
	public CEO(CFO cfo){
		this.cfo=cfo;
	}
	public String getReport(){//CEO���ұ�����������CFOȥ�ұ���
		return cfo.getReport();
	}
}
