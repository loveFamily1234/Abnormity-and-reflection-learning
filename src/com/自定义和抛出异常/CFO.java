package com.自定义和抛出异常;

public class CFO {
	Manager[] ms;

	public CFO(Manager[] ms) {
		super();
		this.ms = ms;
	}
	public String getReport(){//CFO的找报表方法，CFO只找下面的经理要报表
		try{
			return ms[0].getReport();
		}
		catch(ReportNotFoundException e){
			e.printStackTrace();//打印异常的栈信息
		}
		return null;
	}

}
