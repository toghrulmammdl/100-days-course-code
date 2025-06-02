package Threads;

public class ThreadsRunnable {
    public static void threadsRunnable(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    System.out.println("Runnable 1-"+System.nanoTime());
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    System.out.println("Runnable 2-"+System.nanoTime());
                }
            }
        };

        Thread t1 = new Thread(r1, "thread 1");
        Thread t2 = new Thread(r2, "thread 2");
        t1.start();
        t2.start();

        // Join
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Main thread broken");
        }
        System.out.println("Main Thread - done");
    }
}
