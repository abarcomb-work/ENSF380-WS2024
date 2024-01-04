/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/


public class MainTest {
	public static void main(String[] args) {
		int big = 800;
		int med = 70;
		int lil = 4;

		var myObj = new ReturnNumber(big, med, lil);
		System.out.println("Constructed with numbers in order");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		myObj = new ReturnNumber(med, big, lil);
		System.out.println("Constructed with med, big, lil");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		myObj = new ReturnNumber(big, lil, med);
		System.out.println("Constructed big, lil, med");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		myObj = new ReturnNumber(lil, big, med);
		System.out.println("Constructed lil, big, med");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		myObj = new ReturnNumber(lil, med, big);
		System.out.println("Constructed lil, med, big");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());
		
		big = 2;
		med = -90;
		lil = -5521;
		myObj = new ReturnNumber(lil, med, big);
		System.out.println("Constructed some negative numbers");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		big = -2;
		myObj = new ReturnNumber(lil, med, big);
		System.out.println("Constructed all negative numbers");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		med = -88;
		myObj.setMiddle(med);
		System.out.println("Change middle, still middle");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		big = 50;
		myObj.setLargest(big);
		System.out.println("Change largest, still largest");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		lil = -999;
		myObj.setSmallest(lil);
		System.out.println("Change smallest, still smallest");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());

		int num = 66734;
		myObj.setSmallest(num);
		System.out.println("Change smallest, now largest");
		System.out.println("\tBiggest number should be " + num + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + big + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + med + 
			". Was: " + myObj.getSmallest());
		big = num;
		lil = med;

		num = -10000;
		myObj.setMiddle(num);
		System.out.println("Change middle, now smallest");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + lil + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + num + 
			". Was: " + myObj.getSmallest());
		med = lil;
		lil = num;

		lil = 3;
		med = 33;
		big = 333;
		myObj.setAll(med, big, lil);
		System.out.println("Change all");
		System.out.println("\tBiggest number should be " + big + 
			". Was: " + myObj.getLargest());
		System.out.println("\tMiddle number should be " + med + 
			". Was: " + myObj.getMiddle());
		System.out.println("\tSmallest number should be " + lil + 
			". Was: " + myObj.getSmallest());
	}

}
