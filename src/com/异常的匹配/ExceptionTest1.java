package com.�쳣��ƥ��;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//дforѭ����switch��֧��䣬�������л��׳��쳣�����
				for(int i=0;i<5;i++){
					int j=0;
					try{
						System.out.println("������������䣬û���쳣��");//�������
						//��֧��䣬ÿ������1����䣬ǰ4���׳��쳣�����һ��û�׳��쳣
						switch(i){
						case 0:
							int zero=0;
							j=1/zero;
							break;
						case 1:
							int b[] =null;
							j=b[0];
							break;
						case 2:
							int c[] =new int[2];
							j=c[3];
							break;
						case 3:
							char ch="hello".charAt(9);
							break;
						case 4:
							char cha="abc".charAt(1);
							System.out.println("abc�ĵ�2����ĸ��"+cha);
							break;
						}
						System.out.println("ǰ�����䶼û���׳��쳣�Ż������ҡ�");//�������
					}
					//����������쳣��������ԵĶԲ�ͬ���쳣���費ͬ����ʾ
					catch(ArithmeticException ae){
						System.out.println("��������ѧ�����쳣��");
					}
					catch(NullPointerException npe){
						System.out.println("�����˿�ָ���쳣��");
					}
					catch(ArrayIndexOutOfBoundsException aie){
						System.out.println("�����������±�Խ���쳣��");
					}
					catch(StringIndexOutOfBoundsException se){
						System.out.println("�������ַ����±�Խ���쳣��");
					}
					catch(Exception e){
						System.out.println("��"+(i+1)+"�β����쳣");
						System.out.println("��ʾ���쳣��ϢΪ��"+e);
					}
					finally{
						System.out.println("�����쳣�׳�û�׳�������û�����Ҷ�һ�����С�");
					}
	}
	}
}
