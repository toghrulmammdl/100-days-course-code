package Day_4_Thread;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 0;
    private final ReentrantLock lock = new ReentrantLock();

    synchronized public void withdraw(int amount) throws Exception{
        System.out.println(Thread.currentThread().getName()+" try to withdraw money: "+amount);

        while (balance<amount){
            System.out.println("Not enough money in your account, waiting..."+Thread.currentThread().getName());
            wait();
        }
        balance-=amount;
        System.out.println(Thread.currentThread().getName()+" money successfully withdraw");
    }

    synchronized public void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+ " try to deposit money to bank account");
        balance+=amount;
        System.out.println("New balance:"+balance);
        notify();
    }

    public int getBalance(){
        System.out.println("Balance: "+balance);
        return balance;
    }
}
