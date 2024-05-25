package DataStructures;

public class Consumer implements Runnable{
    private Storage storage;

    public Consumer(){}

    public Consumer(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(3000);
                storage.consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }



            public static void main(String[] args) {
                Storage storage = new Storage();
                Thread p1 = new Thread(new Producer(storage));
                Thread p2 = new Thread(new Producer(storage));
                Thread p3 = new Thread(new Producer(storage));

                Thread c1 = new Thread(new Consumer(storage));
                Thread c2 = new Thread(new Consumer(storage));
                Thread c3 = new Thread(new Consumer(storage));

                p1.start();
                p2.start();
                p3.start();
                c1.start();
                c2.start();
                c3.start();
            }
        }



