package com.捕获和处理异常;

public class ExceptionTest {
	public static void main(String[] args) {
		//写for循环和switch分支语句，依次运行会抛出异常的语句
		for(int i=0;i<5;i++){
			int j=0;
			try{
				System.out.println("本条是正常语句，没有异常！");//正常语句
				//分支语句，每次运行1条语句，前4条抛出异常，最后一条没抛出异常
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
					System.out.println("abc的第2个字母是"+cha);
					break;
				}
				System.out.println("前面的语句都没有抛出异常才会运行我。");//正常语句
			}
			catch(Exception e){
				System.out.println("第"+(i+1)+"次捕获异常");
				System.out.println("显示的异常信息为："+e);
			}
			finally{
				System.out.println("不管异常抛出没抛出，捕获没捕获，我都一样运行。");
			}
		}
	}
}
