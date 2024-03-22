/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.lang.*;

public class NotifyAllTest {
    public static void main(String args[]) {
        var msg = new Message("This is the message");

        // Start three Waiter threads
        for (int i = 0; i < 3; i++) {
            Waiter obj = new Waiter(msg);
            Thread t = new Thread (obj);
            t.start();
        }

        Notifier obj = new Notifier(msg);
        Thread t = new Thread (obj);
        t.start();
    }
}

// We will use this class to store a message. We will
// synchronize around this class as well.
class Message {
    private String msg;
  
    public Message(String str) {
        this.msg = str;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}

// This class will create the notification for the other
// threads.
class Notifier implements Runnable {
    private Message msg;

    public Notifier(Message m) {
      this.msg = m;
    }

    public void run() {
       System.out.println("Notifier has started.");
       try {
           Thread.sleep(1000);
           synchronized(msg) {
               msg.setMsg("Notifier is done.");
               // Observe the difference between notifyAll() and notify()
               msg.notifyAll();
//               msg.notify();
           }
       }
       catch (InterruptedException e) {
             System.out.println("Notifier was interrupted with an exception.");
       }
      
    }
}

class Waiter implements Runnable {
    private Message msg;
    private int id;
    private static int counter = 0;

    public Waiter(Message m) {
       this.msg = m;
       // Increment the total count and assign the current
       // count as an ID to this object
       counter++;
       this.id = counter;
       System.out.println("Waiter " + id + " has started.");
    }

    public void run() {
        synchronized(msg) {
             try {
                 // Including a timeout so that if we use notify() instead of
                 // notifyAll() the program will terminate eventually.
                 msg.wait(10000);
             }
             catch (InterruptedException e) {
                 System.out.println("Waiter " + id + " was interrupted with an exception.");
             }
        }
        System.out.println("Waiter " + id + " has ended with message:" + msg.getMsg());
    }
}
