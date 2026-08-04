package Mult_threading;

public class DaemonThread_learnign {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonThreadHelper());
        Thread userThread = new Thread(new UserThreadHelper());
        daemonThread.setDaemon(true);
        daemonThread.start();
        userThread.start();
    }
    
}

class DaemonThreadHelper implements Runnable{
    @Override
    public void run(){
        int count = 0;
        while(count < 500){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon thread running...");
            count++;

        }
    }
}

    class UserThreadHelper implements Runnable{
    @Override
    public void run(){
        int count = 0;
        while(count < 10){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("User thread running...");
            count++;

        }
        System.out.println("User thread executed success fully");
    }
}

// once user thread stop execution JVM will stop the program even if dameon is still running


