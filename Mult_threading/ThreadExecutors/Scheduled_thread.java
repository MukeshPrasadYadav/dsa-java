package Mult_threading.ThreadExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduled_thread {
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new simulate(), 1000, 2000, TimeUnit.MILLISECONDS);
        try {
                if( !service.awaitTermination(10000, TimeUnit.MILLISECONDS)){
                    service.shutdown();
                }
            } catch (Exception e) {
            service.shutdownNow();
        }
    }
    
}

class simulate implements Runnable{
    @Override
    public void run(){
        System.out.println("thread is running now ....");
    }
}
