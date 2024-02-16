/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.*;

public class Exercise {
    public static void main(String args[]) {
        // Create some temporary data structures to use later
        Character[] tmpArray = {'U', 'H'};
        List<Character> tmpLetters = List.of('i', '!', 'Z');
        List<Character> tmpList = Arrays.asList(tmpArray);

        // Create new ArrayDeque from array
        ArrayDeque<Character> queue = new ArrayDeque<>(tmpList);

        // Add elements to the start and end of the list.
        queue.offerFirst('β'); // Start
        queue.offer('C'); // End
        queue.add('H'); // End
        queue.offerLast('H'); // End
        queue.addFirst('a'); // Start
        queue.addAll(tmpLetters); // End
        queue.addLast('ß'); // End
        queue.push('å'); // Start
        // Observe: ArrayDeque is very good at adding elements to the front & back
	    // Observe: ArrayDeque does not allow adding in the middle.

        // Alternate approach to using an iterator; reverse iteration
        System.out.println("...Reverse order");
        for (Iterator it = queue.descendingIterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        // Look at front, end
        System.out.println("...Looking");
        System.out.println(queue.getFirst()); // Start
        System.out.println(queue.getLast()); // End
        System.out.println(queue.peek()); // Start
        System.out.println(queue.peekFirst()); // Start
        System.out.println(queue.peekLast()); // End
        System.out.println(queue.element()); // Start
        System.out.println(queue.contains('U')); // Specific value, returns boolean
        System.out.println("...Non-destructive looks");
        System.out.println(queue);
        // Observe: There is no way to inspect an element by index.

        // Remove characters one at a time. Print what remains.
        System.out.println("...Removing");
        System.out.println(queue.pop()); // Start
        System.out.println(queue.poll()); // Start
        System.out.println(queue.pollFirst()); // Start
        System.out.println(queue.pollLast()); // Last
        System.out.println(queue.remove());   // Start
        System.out.println(queue.removeFirst()); // Start
        System.out.println(queue.removeLast());  // End
        System.out.println(queue.remove('C')); // Specific value, returns boolean
        System.out.println(queue.remove('H')); // Only one instance is removed
        System.out.println("...Remaining");
        System.out.println(queue);
    }
}
