package Threads2;

public class RunTwo implements Runnable{
    @Override
    public void run() {
        try {
            Synchronized.synch2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
