package com.jenson.java8.thread;

class Counter2 {
	
	int count;
	
	public synchronized void increment() {
		count++;
	}
	
}

public class SyncDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		Counter2 counter2 = new Counter2();
		
		Thread t1 = new Thread(()->
		{
			for(int i=0;i<1000;i++) {
				counter2.increment();
			}
		}, "Thread-1");
		
		
		Thread t2 = new Thread(()->
		{
			for(int i=0;i<1000;i++) {
				counter2.increment();
			}
		}, "Thread-2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter2.count);
	}
}
