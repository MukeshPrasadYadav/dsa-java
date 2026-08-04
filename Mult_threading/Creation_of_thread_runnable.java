package Mult_threading;


public class Creation_of_thread_runnable {

    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i =0;i<15 ;i++){
                    System.out.println("Thread 3 running for : "+i);
                }
            }
        });

        Thread t4 = new Thread(() ->{
            for(int i = 0;i<15;i++){
                System.out.println("Thread 4 running for : "+1);
            }
        });

    //    Instant startTime = Instant.now();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
   //     System.out.println("Total time taken" + (Instant.now() - startTime));

        
    }
    
}


class Thread1 implements Runnable{

    @Override
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Thread 1 running for : " +i);
        }
    }

}

class Thread2 implements Runnable{

    @Override
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Thread 2 running for : " +i);
        }
    }

}
