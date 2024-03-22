/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.concurrent.locks.*;
import java.util.Random;

// Three threads are created with MethodOneJob and 3 threads are created
// with MethodTwoJob. Both of these jobs use the single SharedResource "test".
public class TestLock {
    public static void main(String[] args) {
        SharedResource test = new SharedResource();
        Thread thread[] = new Thread[6];
 
        for (int i = 0; i < 3; i++) {
            thread[i] = new Thread(new MethodOneJob(test));
        }
        for (int i = 3; i < 6; i++) {
            thread[i] = new Thread(new MethodTwoJob(test));
        }

        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }
    }
}

// MethodOneJob uses testResource object passed in the construtor.
// run() invokes methodOne method.
class MethodOneJob implements Runnable {
    private SharedResource test;
    MethodOneJob(SharedResource t) {
        test = t;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("(%s) started (MethodOneJob).%n", name);
        test.methodOne("message-from-one");
    }
}

// MethodTwoJob uses SharedResource object passed in the constructor.
// run() invokes methodTwo method.
class MethodTwoJob implements Runnable {
    private SharedResource test;

    MethodTwoJob(SharedResource t) {
        test = t;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("(%s) started (MethodTwoJob).%n", name);
        test.methodTwo("message-from-two");
    }
}

// Class which has two methods, and two different locks. The oneLock 
// ensures that when a lock is acquired on the testResource object, the
// methodOne method has to wait for the lock to be released. But the
// methodTwo method does not need to wait for methodOne because it
// uses a different lock.
class SharedResource {
    private final Lock oneLock = new ReentrantLock();
    private final Lock twoLock = new ReentrantLock();

    public void methodOne(String doc) {
        String name = Thread.currentThread().getName();
        oneLock.lock();
        try {
           Random rand = new Random();
           int delay = rand.nextInt(2500); 
           System.out.printf("(%s) proceeding with methodOne after delay %d.%n",
               name, delay);
           Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            e.printStackTrace(); 
        }
        finally {
            System.out.printf("(%s) methodOne completed: %s%n", name, doc);
            oneLock.unlock();
        }
    }

    public void methodTwo(String doc) {
        String name = Thread.currentThread().getName();
        twoLock.lock();
        try {
           Random rand = new Random();
           int delay = rand.nextInt(2500); 
           System.out.printf("(%s) proceeding with methodTwo after delay %d.%n",
               name, delay);
           Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            e.printStackTrace(); 
        }
        finally {
            System.out.printf("(%s) methodTwo completed: %s%n", name, doc);
            twoLock.unlock();
        }
    }
}
