package com.�Զ�����׳��쳣;

//���������׳��������Զ����쳣
public class ExceptionTest2 {
	public static void main(String[] args) {
		Employee j=new Employee("������");//����Ա������j
		Employee z=new Employee("�Զ���");//����Ա������z
		Employee p=new Employee("������");//����Ա������p
		Employee[] e=new Employee[]{j,z,p};//����Ա������
		Manager[] m=new Manager[]{new Manager(e)};//������������
		CFO cfo=new CFO(m);//����CFO����
		CEO ceo=new CEO(cfo);//����CEO����
		System.out.println(ceo.getReport());//CEO��������ұ���ķ��������
	}

}
