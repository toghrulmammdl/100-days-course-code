package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//class Counter{
//    public static AtomicInteger count = new AtomicInteger(0);
//
//    public static void inc(){
//        count.incrementAndGet();
//    }
//}


class Counter{
    // volatile
    public static volatile int count = 0;

    // synchronized
    public static synchronized void inc(){
        count++;
    }
}

class CounterRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            Counter.inc();
        }
    }
}

public class RaceCondition {
    public static void raceCondition() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Runnable r1 = new CounterRunnable();
        Runnable r2 = new CounterRunnable();

        executor.submit(r1);
        executor.submit(r2);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        System.out.println(Counter.count);
        if (Counter.count != 20000) {
            System.out.println("Race Condition found");
        } else {
            System.out.println("Lucky");
        }
    }

}
