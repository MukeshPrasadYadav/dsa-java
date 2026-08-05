package Mult_threading.ThreadExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed_thread_pool {

    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(2) ) {
            for(int i = 0 ;i < 20 ; i++) service.execute(new Task(i));
            
        } catch (Exception e) {
            // TODO: handle exception
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

