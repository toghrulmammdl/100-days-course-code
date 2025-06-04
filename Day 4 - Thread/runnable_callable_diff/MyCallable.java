package Day_4_Thread.runnable_callable_diff;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<MyObj> {
    // return object
    // exception
    @Override
    public MyObj call() throws Exception {
        return new MyObj();
    }
}
