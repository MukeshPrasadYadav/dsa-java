package Mult_threading;


public class Wait_and_notify_practice {

    private static Object Lock = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            try {
                one();
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() ->{
            try {
                two();
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        
    }

    private static void  one() throws InterruptedException{
         synchronized(Lock){
            System.out.println("hello from one ...");
            Lock.wait();
            System.out.println("After coming from waiting state...");
         }
    }

    private static void  two() throws InterruptedException{
         synchronized(Lock){
            System.out.println("hello from two ...");
            Lock.notify();
            System.out.println("Continuing after notifying...");
         }
    }
    
}
