package Threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadFileImplementation {
    public static void threadFile() throws Exception{
        ExecutorService executors = Executors.newFixedThreadPool(3);
        Runnable r1 = new FileHandle("./src/Threads2/output/output.txt", "IO", "IO with threads 1  "+System.nanoTime());
        Runnable r2 = new FileHandle("./src/Threads2/output/output.txt", "IO", "IO with threads 2  "+System.nanoTime());

        executors.submit(r1);
        executors.submit(r2);

        executors.shutdown();
        executors.awaitTermination(1, TimeUnit.HOURS);
    }
}
