package com.qiu.demo;

public class Demo1 {
	public void test1(int i){
		if (i<0) {
			System.out.println("参数有误");
			return;
		}
		if(i<=2000){
			System.out.println("幸福指数为1");
		}else if(i<=5000){
			System.out.println("幸福指数为2");
		}else if(i<=8000){
			System.out.println("幸福指数为3");
		}else if(i<=10000){
			System.out.println("幸福指数为4");		
		}else{
			System.out.println("幸福指数为5");
		}
	}

}
