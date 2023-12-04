package MultiThreading.UsingCallable;

import MultiThreading.UsingRunnable.Adder;
import MultiThreading.UsingRunnable.HelloWorldPrinter;
import MultiThreading.UsingRunnable.Subtractor;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World, from Main Thread : " +
                Thread.currentThread().getName());

//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//
//        Adder add = new Adder(2,10);
        Subtractor sub = new Subtractor(10,5);

//        Thread t = new Thread(hwp);
//
//        Thread adder = new Thread(add);

        Thread subr = new Thread(sub);


//        t.start();
//        adder.start();

        subr.start();
    }
}
