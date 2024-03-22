/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class ShopApp {
	public static void main(String[] args) throws InterruptedException {
		Shipping shipping = new Shipping();
		Supplier sup = new Supplier(shipping);
		Thread t1 = new Thread(sup);
		Shopper sh = new Shopper(shipping);
		Thread t2 = new Thread(sh);
		t1.start();
		t2.start();
	}
}
