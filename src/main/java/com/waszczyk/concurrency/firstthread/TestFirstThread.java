package com.waszczyk.concurrency.firstthread;

public class TestFirstThread {

	public static void main(String[] args) {
		Runnable obiekt = new Watek();
		Thread firstThread = new Thread(obiekt);
		
		firstThread.start();
		
	}
}
