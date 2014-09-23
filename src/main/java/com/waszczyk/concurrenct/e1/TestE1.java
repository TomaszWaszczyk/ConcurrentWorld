package com.waszczyk.concurrenct.e1;

public class TestE1 {

	public static void main(String[] args) {
		
		System.out.println("Creating threads in Java language");
	
		MyFirstThread text1 = new MyFirstThread("aaaaaaaaaaaaa");
		MyFirstThread text2 = new MyFirstThread("bbbbbbbbbbbbb");
		MyFirstThread text3 = new MyFirstThread("ccccccccccccc");
		
		Thread t1 = new Thread(text1);
		Thread t2 = new Thread(text2);
		Thread t3 = new Thread(text3);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("To juz jest koniec");
	}
	
}
