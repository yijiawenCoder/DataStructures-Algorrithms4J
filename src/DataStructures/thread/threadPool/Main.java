package DataStructures.thread.threadPool;

import DataStructures.thread.MyRunnable;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

/*
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(myRunnable); // 执行一个任务
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.execute(myRunnable2); // 执行一个任wu

 */
      /*  ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(myRunnable, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(myRunnable2, 2, TimeUnit.SECONDS);*/
        ExecutorService executorService = Executors.newSingleThreadExecutor();
           executorService.execute(myRunnable);
        executorService.execute(myRunnable2);

    }


}
