package Day_4_Thread;

public class MyRun2 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(i+"Thread Two");
        }
    }
}
