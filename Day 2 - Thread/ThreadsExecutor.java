package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(i+"My Runnable "+name+" "+System.nanoTime());
        }
    }
}

public class ThreadsExecutor {
    public static void threadsExecutor() throws InterruptedException {
        MyRunnable mr1 = new MyRunnable("1");
        MyRunnable mr2 = new MyRunnable("2");

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(mr1);
        executor.submit(mr2);

        System.out.println("Before Await");
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("After Await");

    }
}
