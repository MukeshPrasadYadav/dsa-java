package Mult_threading.ThreadExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Single_thread_executor {

    public static void main(String[] args) {
        try (ExecutorService singleThreadExecutorService = Executors.newSingleThreadExecutor()) {
            
            for(int i = 0 ;i < 5; i++) singleThreadExecutorService.execute(new Task(i));
        }
        
    }
    
}


class Task implements Runnable{

    private final int taskId;

    public Task(int id){
        this.taskId = id;
    }

    @Override
    public void run(){
        System.out.println("Thread "+ Thread.currentThread().getName() +"  running for : " + taskId);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }

}


// This gurantees that work will happend in fifo manner can be used for sending message sequentally , appointment booking and conumsing
// problem : if one operation took so much time then other operation must have to wait for long time as this is single thread only
