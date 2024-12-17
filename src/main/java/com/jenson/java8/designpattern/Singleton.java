package com.jenson.java8.designpattern;

public class Singleton {

	public static void main(String[] args) {
		
		SingletonSynchorized instance = SingletonSynchorized.getInstance();
		System.out.println(instance);
		
		SingletonSynchorized instance1 = SingletonSynchorized.getInstance();
		System.out.println(instance1);

	}

}

class SingletonSynchorized {

	private static SingletonSynchorized instance; // Use volatile.

	private SingletonSynchorized() {
	}

	public static SingletonSynchorized getInstance() {
	    if (instance == null) { // First check (no locking).
	        synchronized (SingletonSynchorized.class) {
	            if (instance == null) { // Second check (with locking).
	                instance = new SingletonSynchorized();
	            }
	        }
	    }
	    return instance;
	}

}
