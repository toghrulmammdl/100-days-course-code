package Threads2;

public class RunOne implements Runnable{
    @Override
    public void run() {
        try {
            Synchronized.synch();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
