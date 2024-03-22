/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.Random;

class Supplier implements Runnable {
	private Shipping shipping;

	public Supplier(Shipping shipping) {
		this.shipping = shipping;
	}

	public void run() {
		String itemList[] = { "MacBook Pro", "OnePlus 9 Pro", "Google Pixel 4a", "Apple iPad Pro 12.9-Inch" };
		for (int i = 0; i < itemList.length; i++) {
			try {
				shipping.set(itemList[i]);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.format("Item received from supplier: %s%n", itemList[i]);
			try {
				Thread.sleep(new Random().nextInt(7000));
			} catch (InterruptedException e) {
			}
		}
		try {
			shipping.set("NONE");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
