package Mult_threading;

public class Learn_join_method  {
    public static void main (String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
            for(int i =0;i<15;i++){
                System.out.println("Thread 1 for : "+i);
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i =0;i<25;i++){
                System.out.println("Thread 2 for : "+i);
            }
        });

        // t1.start();
        // t2.start();
        // System.out.println("After completion");

        // Output : the out put will be the   System.out.println("After completion"); will be executed first 
        // as this belongs to main thread and later the thread will executed
        // meaning t1.start() will going in running state so does t2.start() but main thread is already running

        // t1.start();
        // t2.start();
        // t1.join();
        // System.out.println("After execution of t1");

//         OUtput : after t1 will finish execution the sout would be printed meaning Join method waits for thread t1 to stop execution
//         Real life example : Imagine your mom tells you:

// Boil water.
// Add tea leaves.
// Pour into a cup.

// You cannot pour the tea into the cup until the water has finished boiling.

    }
    
}
