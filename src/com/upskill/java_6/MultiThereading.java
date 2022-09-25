package com.upskill.java_6;

public class MultiThereading {
	/* Multithreading is a java frature that allowa concurrent execution of the of more parts of a program.
	 
	 Threads can be created by using two mechanisms:
	 
	 	1. Extending the Thread class
	 	2. Implementaing the Runnable Interfce */

	public static void main(String[] args){			
		int n = 2;													//number of threads
		for (int i = 0; i < n; i++){
			MultithreadingDemo obj = new MultithreadingDemo();		// Obj for extending the thread class
			obj.start();
}
}
}
class MultithreadingDemo extends Thread{
	public void run(){
		try{
			System.out.println("Thread" + Thread.currentThread().getId() + " is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
	
	
}

class MultithreadingDemo2 implements Runnable{	//Implementing thr runnable interface
	public void run(){
		try{
			System.out.println("Thread" + Thread.currentThread().getId() + " is running");
		}catch (Exception e){
			System.out.println("Exception is caught");
	}
	}
}
