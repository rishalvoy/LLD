package MultiThreading.UsingRunnable;

public class Subtractor implements Runnable{

    int x;
    int y;

    public Subtractor(int a, int b)
    {
        this.x=a;
        this.y=b;
    }
    @Override
    public void run()
    {
        System.out.println("Adder, from thread : " +(x-y)+
                Thread.currentThread().getName());
    }
}
