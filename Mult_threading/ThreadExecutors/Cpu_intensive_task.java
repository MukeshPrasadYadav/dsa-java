package Mult_threading.ThreadExecutors;

public class Cpu_intensive_task {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores is : " + cores);
    }
}
