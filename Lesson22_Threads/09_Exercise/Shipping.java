/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

class Shipping {
	private String item; // item sent from supplier to shopper.
	private boolean empty = true; // true if no item in shipping

	public synchronized String get() throws InterruptedException {
		while (empty) { // shopper waits while empty
			wait();
		}
		empty = true;
		notifyAll(); // Notify suppliers -- ready to get
		return item;
	}

	public synchronized void set(String item) throws InterruptedException {
		while (!empty) { // supplier waits if it's full
			wait();
		}
		empty = false;
		this.item = item;
		notifyAll(); // Notify shopper that item is available
	}
}
