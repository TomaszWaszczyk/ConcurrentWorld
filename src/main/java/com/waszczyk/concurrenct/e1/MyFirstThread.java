package com.waszczyk.concurrenct.e1;

public class MyFirstThread implements Runnable{

	private String text;
	
	public MyFirstThread(String text){
		
		this.text = text;
	}

	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(text);
		}
		
		try {
			Thread.sleep((int)Math.random() * 2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
