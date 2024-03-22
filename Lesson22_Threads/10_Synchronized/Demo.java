/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

class Account {
    private double amount;

    Account(double initDeposit) {
        amount = initDeposit;
    }

    // public double withdraw(double wanted) {
    synchronized public double withdraw(double wanted) {
        if (this.amount >= wanted) {
          // Mandatory cooling-off period for removing money
          try {
              Thread.sleep(1000);
          }
          catch (InterruptedException e) {
              e.printStackTrace();
          }

          this.amount -= wanted;
          return wanted;
        } 
        return 0;
    }

    public double balance() {
        return amount;
    } 

    public void deposit(double given) {
        if (given < 0) {
            System.exit(1);
        }
        amount += given;
    }
}

class MyThread extends Thread {
    private String s;
    private Account account;

    public MyThread(String str, Account acc) {
        super(str);
        account = acc;
    }

    public void run() {
        double value = 100.00;

        for (int i=0; i < 5; i++) {
            double withdrawn = 0;
            if (account.balance() >= value) {
                withdrawn = account.withdraw(value);
            }
            System.out.format("(%s) Withdrew $%.2f. Balance is $%.2f.%n",
              getName(), withdrawn, account.balance());
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Account acc = new Account(300.00);
        MyThread t1 = new MyThread("A", acc);
        MyThread t2 = new MyThread("B", acc);
        MyThread t3 = new MyThread("C", acc);
        t1.start();
        t2.start();
        t3.start();
    }
}
