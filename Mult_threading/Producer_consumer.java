package Mult_threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producer_consumer {

    public static void main(String[] args) {
        int top;
        int bottom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the top value");
        top = sc.nextInt();
        System.out.println("Enter the bottom value");
        bottom = sc.nextInt();
        worker worker = new worker(top, bottom);

        Thread producer = new Thread(() ->{
            try {
                worker.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() ->{
            try {
                worker.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
        sc.close();

       

    }

    
}

class worker{
    private int top;
    private int bottom;
    private int sequence = 0;
    private List<Integer> container;
    private static Object Lock = new Object();

    public worker(int top, int bottom){
        this.top  = top;
        this.bottom = bottom;
        this.container = new ArrayList<>();
    }

    public void produce() throws InterruptedException{
        while(true){
        synchronized(Lock){
           
             if(container.size() == top){
            System.out.println("Container is full waiting for to have some space");
            Lock.wait();   
        }
        else{
            System.out.println(sequence++ +" adding in container");
            container.add(sequence);
            Lock.notify();
        }
        Thread.sleep(500);
           }

        }
    }


    public  void consume() throws InterruptedException{
        while(true){
        synchronized(Lock){
            
                if(container.size() == bottom){
                System.out.println("Container is at bottom waiting to be filled up ...");
                Lock.wait();
            }else{
                System.out.println("Removing the value" + container.removeFirst() + "from Container");
                Lock.notify();
            }
            Thread.sleep(500);
            }
        }
    }

}
