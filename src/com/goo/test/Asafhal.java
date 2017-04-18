package com.goo.test;

public class Asafhal {
	String name;
//	@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return "160:16";
//		}
public static void main(String[] args) {
	Asafhal a = new Asafhal();
	a.setName("niuge");
	Asafhal b = new Asafhal();
	a.setName("niuge");
	System.out.println(a.equals(b));
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return this.toString().equals(obj.toString());
}
}
