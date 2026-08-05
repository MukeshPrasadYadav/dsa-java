package Mult_threading.ThreadExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cached_thread_executor {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newCachedThreadPool()) {
            for(int i = 0 ; i < 1000 ; i++ ) service.execute(new Task(i));
            
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

// In this new threds are created until a thread is free for utilization if no thread has any task for 60 second it gets killed.


