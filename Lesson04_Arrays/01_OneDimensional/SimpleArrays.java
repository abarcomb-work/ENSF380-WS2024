/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

import java.util.Arrays;

public class SimpleArrays {

    public static int[] arrayFourElements() {
        // Create an array of integers containing the values shown
        int[] implicitLengthArray = {1, 2, 3, 5};
        System.out.println("implicitLengthArray is an int array with 4 elements: ");
        // Iterate through the array and output the value. 
        for (int tmpValue : implicitLengthArray) {
          System.out.println(tmpValue);
        }
        return implicitLengthArray;
    }

    public static int[] arrayThreeElements() {
	 // Create an array of integers with a length of three
        int[] explicitLengthArray = new int[3];
        // Iterate through the array: show original values; set new ones
        System.out.println("explicitLengthArray is an empty int array but we set values: ");
        for (int i=0; i < explicitLengthArray.length; i++) {
            System.out.println(explicitLengthArray[i]);
            explicitLengthArray[i] = 10*i;
            System.out.println(explicitLengthArray[i]);
        }
        return explicitLengthArray;
    }

    public static int[] copyByRef(int[] explicitLengthArray) {
        // Copy an array (by reference)
        System.out.println("First value of explicitLengthArray after it was changed by another ref: ");
        int[] copyArray = explicitLengthArray;
        copyArray[0] = 80000;
        System.out.println(explicitLengthArray[0]);
        return copyArray;
    }

    public static int[] copyByValue(int[] explicitLengthArray) {
        // Copy an array by value, first 2 elements
        // 2 is the length of the new array
        // copyOf is provided by java.util.Arrays
        int[] valueCopyArray = Arrays.copyOf(explicitLengthArray, 2);
        System.out.println("valueCopyArray is the first 2 elements of explicitLengthArray: ");
        valueCopyArray[1] = 93;
        // The value has been changed for the copy
        for (int tmpValue : valueCopyArray) {
            System.out.println(tmpValue);
        }
        // The original array retains the original value
        System.out.println("explicitLengthArray was not changed when we copy by value: ");
        System.out.println(explicitLengthArray[1]);
        return valueCopyArray;
    }

    public static int[] replaceArray(int[] explicitLengthArray) {
        // Original reference now points to new array
        explicitLengthArray = new int[2];
        System.out.println("explicitLengthArray references a different, empty array: ");
        for (int tmpValue : explicitLengthArray) {
            System.out.println(tmpValue);
        }
        return explicitLengthArray;
    }

    public static char[] createChar() {
        // Demonstrate an array with a different primitive type
        char[] originalCharArray = {'a', 'B', 'c', 'D', '5'};
        System.out.println("originalCharArray has five elements: ");
        // Notice that tmpValue is a different variable type than before
        // This tmpValue is in a different scope than the int tmpValue
        // Even as part of the same method, it would be fine, as it is
        // declared for the loop only.
        for (char tmpValue : originalCharArray) {
            System.out.println(tmpValue);
        }
        return originalCharArray;
    }

    public static char[] copySubset(char[] originalCharArray) {
        // Copy a subset of the char array into a new array
        System.out.println("subsetCharArray contains values from indices 1, 2 & 3 of originalCharArray: ");
        char[] subsetCharArray = Arrays.copyOfRange(originalCharArray, 1, 4);
        for (char tmpValue : subsetCharArray) {
            System.out.println(tmpValue);
        }
        return subsetCharArray;
    }

    public static char[] replaceZ(char[] subsetCharArray) {
        // Replace the values with a fill
        System.out.println("subsetCharArray filled with z: ");
        Arrays.fill(subsetCharArray, 'z');
        for (char tmpValue : subsetCharArray) {
            System.out.println(tmpValue);
        }
        return subsetCharArray;
    }

    public static char[] overwriteArray(char[] originalCharArray, char[] subsetCharArray) {
        System.out.println("subsetCharArray modified with arraycopy: ");
        // Demonstrate arraycopy
        // From orginalCharArray, starting at index 1, copy to subsetCharArray
        // starting at index 0. Copy 2 elements.
        System.arraycopy(originalCharArray, 1, subsetCharArray, 0, 2);
        for (char tmpValue : subsetCharArray) {
            System.out.println(tmpValue);
        }
        return subsetCharArray;
    }

    // The code has been broken into many different methods to avoid length methods.
    // But it is quite repetitious (for easy reading) therefore is not an example of good style
    public static void main(String[] args) {
        // int arrays
        int[] implicitLengthArray = arrayFourElements();
        int[] explicitLengthArray = arrayThreeElements();
        int[] copyArray = copyByRef(explicitLengthArray);
        int[] valueCopyArray = copyByValue(explicitLengthArray);
        explicitLengthArray = replaceArray(explicitLengthArray);
    
        // char arrays
        char[] originalCharArray = createChar();
        char[] subsetCharArray = copySubset(originalCharArray);
        subsetCharArray = replaceZ(subsetCharArray);
        subsetCharArray = overwriteArray(originalCharArray, subsetCharArray);        
    }
}
  
