package Day_4_Thread.ReentrantLockImplementation;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.locks.ReentrantLock;


public class LockImpl{
    public static final ReentrantLock reentrantLock = new ReentrantLock();
    private static boolean isTwelve = false;

    public static void main(String[] args) {
         Runnable task = () ->{
             String threadName = Thread.currentThread().getName();
             reentrantLock.lock();

             try{
                 System.out.println(reentrantLock.isLocked());
                 System.out.println(threadName+" locked");
                 Thread.sleep(2000);
                 System.out.println(threadName+" finished");
             }catch (Exception e){
                 e.printStackTrace();
             }finally {
                 System.out.println(threadName+" unlocked");
                 reentrantLock.unlock();
             }
         };
         
        Thread t1 = new Thread(task, "ThreadOne");
        Thread t2 = new Thread(task, "ThreadTwo");

        t1.start();
        t2.start();
    }
}
