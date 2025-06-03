package Threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
//        ThreadFileImplementation.threadFile();

        ExecutorService executors = Executors.newFixedThreadPool(3);
        executors.submit(new RunOne());
        executors.submit(new RunTwo());

        executors.shutdown();
        executors.awaitTermination(1, TimeUnit.HOURS);
    }
}
