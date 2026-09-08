class Demo1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Demo2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2 is Running");
    }
}
public class JoinDemo
{
    public static void main(String arhgs[])
    {
        Demo1 d=new Demo1();
        d.start();
        Demo2 d2=new Demo2();
        try
        {
            d.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }

        d2.start();
    }
}
