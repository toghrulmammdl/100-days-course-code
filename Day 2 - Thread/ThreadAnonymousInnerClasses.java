package Threads;

public class ThreadAnonymousInnerClasses {
    public static void threadAnonymousInnerClasses(){
        // active count function
        System.out.println(Thread.activeCount());


        // threads
        Thread thread1 = new Thread(){
            public void run(){
                for(int i=0; i<100; i++){
                    System.out.println("Thread 1-"+System.nanoTime());
                }
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                for (int j=0;j<100; j++){
                    System.out.println("Thread 2-"+System.nanoTime());
                }
            }
        };

        // starting threads
        thread1.start();
        thread2.start();
        System.out.println(Thread.activeCount());

    }
}
