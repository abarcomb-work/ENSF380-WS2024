/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadPoolDemo {
	
	public static void main (String [] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 12; i++) {
			executor.execute(new MyThreadInThreadPool(i));
		}
		
              
		executor.shutdown();
		System.out.println("All tasks submitted.");
		executor.awaitTermination(1,  TimeUnit.HOURS);
                // If we want to terminate tasks in progress:
                // executor.shutdownNow();
	}
}

