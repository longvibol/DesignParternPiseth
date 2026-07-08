package com.pisethjavaschool.factory.lesson09_FactoryInJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
		    executor.submit(() -> {
		        System.out.println(Thread.currentThread().getName());
		    });
		}

		executor.shutdown();
		
//		Notice that only five thread names appear repeatedly.
	}

}
