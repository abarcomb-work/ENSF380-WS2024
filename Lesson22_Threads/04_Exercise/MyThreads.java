/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.lang.*;

public class MyThreads {
    public static void main(String args[]) {
        WaitingForAnotherThreadToFinish obj = new WaitingForAnotherThreadToFinish();
        Thread t = new Thread (obj);
        t.start();
    }
}


class WaitingOnThisThread implements Runnable {
    public void run() {
        System.out.println("WaitingOnThisThread has started.");

        // Sleep a short while
        try {
            Thread.sleep(60);
        }
        catch (InterruptedException e) {
            System.out.println("WaitingOnThisThread was interrupted with an exception.");
        }

        System.out.println("WaitingOnThisThread has ended.");
    }
}



class WaitingForAnotherThreadToFinish implements Runnable {
    public void run() {
        System.out.println("WaitingForAnotherThreadToFinish has started.");

        // Launch another thread
        WaitingOnThisThread obj = new WaitingOnThisThread();
        Thread t = new Thread (obj);
        t.start();
      
        try {
            // Wait until WaitingOnThisThread finishes before resuming. We could
            // optionally provide an argument of milliseconds, in which case
            // we would wait that length of time or until WaitingOnThisThread finishes,
            // whichever happens first.
            t.join();
            // t.join(10); 
        }
        catch (InterruptedException e) {
                System.out.println("WaitingForAnotherThreadToFinish was interrupted with an exception.");
        }

        System.out.println("WaitingForAnotherThreadToFinish has ended.");
    }
}
