/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class MyThreadInThreadPool implements Runnable{
	private int id;
	
	public MyThreadInThreadPool (int id) {
		this.id = id;
	}
	
	public void run () {
		System.out.println("Starting: " + id);
		
		try {
			Thread.sleep(1000);
			
		}
                catch (InterruptedException e) {}
		System.out.println("Completed: " + id);
	}
}

