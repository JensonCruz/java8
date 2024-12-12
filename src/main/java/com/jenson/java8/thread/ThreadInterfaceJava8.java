package com.jenson.java8.thread;

public class ThreadInterfaceJava8 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "My thread-1");
		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {
				System.out.println("say hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "My thread-2");

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		System.out.println("T1: "+t1.getName() + " T2: "+t2.getName());
		
		
		
		t1.join();
		t2.join();
		
		
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");

	}
}
