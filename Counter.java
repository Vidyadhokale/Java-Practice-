public class Counter extends Thread
{
    int count=0;
    synchronized void increment()
    {
        count++;
    }
    public void run()
    {
        for(int i = 1; i <= 1000; i++)
        {
            increment();
        }
    }
    public static void main(String args[])
    {
        Counter c = new Counter();
        Thread t1=new Thread(c);
        t1.start();
        Thread t2=new Thread(c);
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("count :"+c.count);
    }
}
