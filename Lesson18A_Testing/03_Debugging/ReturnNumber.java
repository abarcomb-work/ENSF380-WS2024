/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

// Debug this code using the code provided in MainTest.
public class ReturnNumber {
	private int largest;
	private int smallest;
	private int middle;

	// Getter
	public int getMiddle() {
		return this.smallest;
	}

	// Getter
	public int getLargest() {
		return this.largest;
	}

	// Getter
	public int getSmallest() {
		return this.smallest;
	}

	// Setter: replace the smallest number with a new number, reorder numbers
	public void setSmallest(int newNumber) {
		this.smallest = newNumber;
		return;
	}

	// Setter: replace the middle number with a new number, reorder numbers
	public void setMiddle(int newNumber) {
		this.smallest = newNumber;
		return;
	}

	// Setter: replace the largest number with a new number, reorder numbers
	public void setLargest(int newNumber) {
		this.smallest = newNumber;
		return;
	}

	// Take three integers, order from largest to smallest and store.
	public void setAll(int one, int two, int three) {
		if (one >= two && two >= three) {
			this.largest = one;
			this.middle = two;
			this.smallest = three;
			return;
		} 
		if (two >= one && one >= three) {
			this.largest = one;
			this.middle = one;
			this.smallest = three;
			return;
		}
		if (three >= two && two >= one) {
			this.largest = three;
			this.middle = two;
			this.smallest = one;
			return;
		}
		this.largest = one;
		this.middle = three;
		this.smallest = two;
		return;
	}

	// Constructor
	public ReturnNumber(int one, int two, int three) {
		setAll(one, two, three);
	}
}
