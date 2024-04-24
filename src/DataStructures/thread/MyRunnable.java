package DataStructures.thread;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable{
      //run干活的方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
