package com.qiu.demo;

public class Demo1 {
	public void test1(int i){
		if (i<0) {
			System.out.println("��������");
			return;
		}
		if(i<=2000){
			System.out.println("�Ҹ�ָ��Ϊ1");
		}else if(i<=5000){
			System.out.println("�Ҹ�ָ��Ϊ2");
		}else if(i<=8000){
			System.out.println("�Ҹ�ָ��Ϊ3");
		}else if(i<=10000){
			System.out.println("�Ҹ�ָ��Ϊ4");		
		}else{
			System.out.println("�Ҹ�ָ��Ϊ5");
		}
	}

}
