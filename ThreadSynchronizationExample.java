/*
Write a program for thread synchronization. 
*/
class BankAccount {
    private int balance;

    BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    // synchronized method to ensure only one thread can withdraw at a time
    public synchronized void withdraw(int amount, String threadName) {
        if (balance >= amount) {
            System.out.println(threadName + " is withdrawing " + amount);
            balance -= amount;

            // Simulate some delay
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(threadName + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(threadName + " attempted to withdraw " + amount + " but insufficient balance. Remaining balance: " + balance);
        }
    }
}

class WithdrawThread implements Runnable {
    private BankAccount account;
    private int amount;
    private String name;

    WithdrawThread(BankAccount account, int amount, String name) {
        this.account = account;
        this.amount = amount;
        this.name = name;
    }

    public void run() {
        account.withdraw(amount, name);
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // initial balance

        // Two threads trying to withdraw money concurrently
        Thread t1 = new Thread(new WithdrawThread(account, 700, "Thread 1"));
        Thread t2 = new Thread(new WithdrawThread(account, 500, "Thread 2"));

        t1.start();
        t2.start();
    }
}
