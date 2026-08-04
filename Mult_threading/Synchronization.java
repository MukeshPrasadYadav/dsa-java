package Mult_threading;

public class Synchronization {

    private static int counter = 0;

    public static void main(String[] args) {
        
        Thread t1 = new Thread(() ->{
            for(int i =0 ; i < 10000 ; i++ ) increment();
        });

        Thread t2 = new Thread(() ->{
            for(int i =0 ; i < 10000 ; i++ ) increment();
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finsihed execution");
        System.out.println("Thread count : " + counter);



    }

    
    private synchronized  static void  increment(){
        counter++;
    }
}
