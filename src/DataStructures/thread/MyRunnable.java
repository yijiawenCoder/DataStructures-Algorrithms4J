package DataStructures.thread;

public class MyRunnable implements Runnable{
      //run干活的方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
