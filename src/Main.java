import DataStructures.thread.MyCallable;
import DataStructures.thread.MyRunnable;
import DataStructures.thread.MyThread;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    /*
          runnable的实现方式

        MyRunnable myRunnable = new MyRunnable();
        Thread javaTread = new Thread(myRunnable);
        javaTread.start();


        */

/*      callable的实现方式
       MyCallable callable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread= new Thread(futureTask);
        thread.start();

        */

    }
}