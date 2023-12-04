package MultiThreading.UsingCallable;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Integer> {

    int x;
    int y;

    Subtractor(int a, int b)
    {
        this.x=a;
        this.y=b;
    }

    @Override
    public Integer call(){
        System.out.println("Subtractor From Callable, from thread : " +(x-y)+
                Thread.currentThread().getName());
        return x-y;
    }
}
