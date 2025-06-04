package Day_4_Thread;

public class BankSystem {
    public static void bankingFlow() throws InterruptedException {
        BankAccount bankAccount = new BankAccount();

        Thread withdraw = new Thread(()->{
            try {
                bankAccount.withdraw(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }, "WithdrawThread");

        Thread deposit = new Thread(()->{
            try {
                Thread.sleep(2000);
                bankAccount.deposit(2300);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }, "DepositThread");


        withdraw.start();
        deposit.start();

        withdraw.join();
        deposit.join();

        bankAccount.getBalance();
    }
}
