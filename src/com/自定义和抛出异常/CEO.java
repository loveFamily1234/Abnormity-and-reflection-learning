package com.自定义和抛出异常;

public class CEO {
	CFO cfo;
	public CEO(CFO cfo){
		this.cfo=cfo;
	}
	public String getReport(){//CEO的找报表方法，调用CFO去找报表
		return cfo.getReport();
	}
}
