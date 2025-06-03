package Threads2;

public class Synchronized {

    public static final Object monitor_one = new Object();
    public static final Object monitor_two = new Object();

    public static int i=0;
    public static synchronized void synch() throws InterruptedException {
        System.out.println("hello");
        synchronized (monitor_one){
            i++;
            System.out.println("Thread one");

            //process that take too much time
            for(int j=0; j<100; j++){
                System.out.println("Hi");
            }
            synchronized (monitor_two){
                i++;
            }
        }
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }

    public static void synch2() throws InterruptedException {
        System.out.println("salut");
        synchronized (monitor_two) {
            i++;
            System.out.println("Thread Two");

            //process that take too much time
            for(int j=0; j<100; j++){
                System.out.println("Bonjour");
            }
            synchronized (monitor_one){
                i++;
            }
        }
        System.out.println("salut");
        System.out.println("salut");
        System.out.println("salut");
        System.out.println("salut");
    }
}
