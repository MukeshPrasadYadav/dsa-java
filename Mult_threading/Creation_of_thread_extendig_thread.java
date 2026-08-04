package Mult_threading;

public class Creation_of_thread_extendig_thread {
    public static void main(String[] args) {
        Thread t1 = new Thread3();
        Thread t2 = new Thread4();
        t1.start();
        t2.start();
        
    }
    
}

 class Thread3 extends Thread{

    @Override
    public void run(){
        System.out.println("Thread created extending thread");
        for(int i =0;i< 15;i++)
        {
            System.out.println("Thread 1 running for : "+i);
        }
    }

}


 class Thread4 extends Thread{

    @Override
    public void run(){
        System.out.println("Thread created extending thread");
        for(int i =0;i< 15;i++)
        {
            System.out.println("Thread 2 running for : "+i);
        }
    }

}
