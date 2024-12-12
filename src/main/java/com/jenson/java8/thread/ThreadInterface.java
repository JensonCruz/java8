package com.jenson.java8.thread;

class Bye implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("bye");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class SayHello implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Say Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class ThreadInterface {

	public static void main(String[] args) {

		Runnable bye = new Bye();
		Runnable sayHello = new SayHello();
		
		Thread t1 = new Thread(bye);
		Thread t2 = new Thread(sayHello);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();

	}
}
