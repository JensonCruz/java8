package com.jenson.java8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Hi extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Hello extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class ThreadDemo {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
		    executor.submit(() -> System.out.println("Task executed by: " + Thread.currentThread().getName()));
		}
		executor.shutdown();


		Hi hi = new Hi();
		Hello hello = new Hello();

		hi.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hello.start();

	}
}
