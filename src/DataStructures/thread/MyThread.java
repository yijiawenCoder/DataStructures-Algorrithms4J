package DataStructures.thread;

public class MyThread extends  Thread{
    @Override
    public void run() {


        System.out.println("MyThread");
        super.run();
    }
}
