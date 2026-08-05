package Mult_threading;

public class Synchronizatin_with_lock {


    private static Object Lock = new Object();

    private static int counter1 = 0;
    private static int counter2 = 0;
    public static void main(String[] args) {

        Thread t1 = new  Thread(() ->{
            for(int i = 0; i < 10000; i++) increment1();
        });

        Thread t2 = new  Thread(() ->{
            for(int i = 0; i < 10000; i++) increment2();
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            System.out.println("Counter 1 value : "+counter1);
            System.out.println("Counter 2 value : "+counter2);

            System.out.println("Finished execution");
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException(e);
        }
        
        
    }

    private static void increment1(){
        synchronized(Lock){
            counter1++;
        }
    }
    private static void increment2(){
        synchronized(Lock){
            counter2++;
        }
    }


    // even both thred are trying to access different methods but if we define method level synchronization it will lock entire class
    
}
