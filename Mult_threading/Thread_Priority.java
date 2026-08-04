package Mult_threading;

public class Thread_Priority {

    public static void main(String[] args) {
        // System.out.println("main thread name "+ Thread.currentThread().getName());
        // System.out.println("Priority of main thread"+Thread.currentThread().getPriority());
        // System.out.println("Setting max priority to current thread");
        // Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        // System.out.println("Main thred priority after assinging max priority"+ Thread.currentThread().getPriority());


        // Output : generally priority is 5 max can be set up to 10

        System.out.println(Thread.currentThread().getName() + " says hi !!");

        Thread one = new Thread(() ->{
            Thread.currentThread().setName("Baijanti Mala");
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            System.out.println(Thread.currentThread().getName() + "says hi !! as well");
        });

        one.start();
    }

    // Output : we expect :
    //             Baijanti Malasays hi !! as well
    //             main says hi !!

    //             but it will be opposite 
    //             becuase no what what is priiority of other thread main thread will execute first 

    //             IF two thread have same priority then scheduler will schedule in FIFO manner
    

}
