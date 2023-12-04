package MultiThreading.UsingRunnable;

public class Adder implements Runnable{
    private int x;
    private int y;

    public Adder(int x, int y)
    {
        this.x=x;
        this.y=y;
    }


    @Override
    public void run()
    {
        System.out.println("Adder, from thread : " +(x+y)+
                Thread.currentThread().getName());
    }
}
