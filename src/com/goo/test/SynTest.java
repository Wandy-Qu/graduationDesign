package com.goo.test;




public class SynTest implements Runnable {
	SynUnit  sysUnit;
	int a =0;
	SynTest(SynUnit sysUnit,int a){
		this.sysUnit= sysUnit;
		this.a=a;
	}
	boolean flag = true;

	public void run() {
		
		sysUnit.sysT(a);
	
	}
	public static void main(String[] args) throws InterruptedException {
		SynUnit s1 = new SynUnit();
		Thread a = new Thread(new SynTest(s1,1));
		Thread b = new Thread(new SynTest(s1,10));
		a.start();
		
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().sleep(100);
		b.start();
//		boolean flag = true;
//		while(flag){
//			if(Thread.currentThread().getName()==a.getName()){
//				flag=false;
//				s1.wait();
//			}
//		}
	}
}


