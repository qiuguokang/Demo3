package com.qiu.demo;

public class Demo3 {
	public void test1(double x){
		/**
		 * �����ж�
		 */
		if (x<=0) {
			System.out.println("��������");
			return;
		} 
		/**
		 * ����
		 */
		double tax = 0;
		if (x<3500) {
			System.out.println("���������㣬0˰��");
		}else if(x<4500) {
			tax = (x-3500)*0.1-105;
			if(tax<0){
				System.out.println("˰�յ��ڿ۳���������˰");
			}else{
			System.out.println("tax:"+tax);
			}
		}else if(x<9000){
			tax = (x-3500)*0.2-555;
			if(tax<0){
				System.out.println("˰�յ��ڿ۳���������˰");
			}else{
			System.out.println("tax:"+tax);
			}
		}else if(x<35000){
			tax = (x-3500)*0.25-1005;
			System.out.println("tax:"+tax);
		}else if(x<55000){
			tax = (x-3500)*0.3-2755;
			System.out.println("tax:"+tax);
		}else if(x<80000){
			tax = (x-3500)*0.35-5505;
			System.out.println("tax:"+tax);
		}else if(x>80000){
			tax = (x-3500)*0.45-13505;
			System.out.println("tax:"+tax);
		}

		}

}
