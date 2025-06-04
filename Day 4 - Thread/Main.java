package Day_4_Thread;

import java.util.concurrent.*;

// join, wait, notify, sleep, ReentrantLock
public class Main {
    public static void main(String[] args) throws Exception {

        starterThreadJoin();
        BankSystem.bankingFlow();
        executorServices();


    }
    public static void starterThreadJoin() throws InterruptedException {
        MyRun myRun = new MyRun();
        MyRun2 myRun2 = new MyRun2();

        Thread threadOne = new Thread(myRun);
        Thread threadTwo = new Thread(myRun2);

        threadOne.start();
        threadOne.join();

        threadTwo.start();
        threadTwo.join();


    }

    public static void executorServices(){
        // One single thread implemented
        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor();

        // Fixed Thread pool
        ExecutorService executorServiceFixed = Executors.newFixedThreadPool(4);

        // Create new thread if needed.
        ExecutorService executorServiceCached = Executors.newCachedThreadPool();

        // Cron logic
        ScheduledExecutorService executorServiceScheduler = Executors.newScheduledThreadPool(4);

        executorServiceScheduler.schedule(()->{
            System.out.println("2 seconds");
        }, 2, TimeUnit.SECONDS);
        executorServiceScheduler.shutdown();

        //  executorServiceScheduler.scheduleWithFixedDelay(()->{
        //  System.out.println("2 seconds");
        //  }, 0, 2, TimeUnit.SECONDS);

        //Divide and conquer
        ForkJoinPool pool = new ForkJoinPool();
    }
}
