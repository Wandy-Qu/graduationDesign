package com.goo.test;

public class SynUnit{
	int i =0;
	public synchronized  void sysT(int a){
		i+=a;

		try {
			if(a==1){

				Thread.currentThread().sleep(3000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
	
	
}