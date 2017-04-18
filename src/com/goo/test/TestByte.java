package com.goo.test;

public class TestByte {
	public static void main(String[] args) {
		char a = "a".toCharArray()[0];
		System.out.println(a);
		byte[] b = "A".getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
