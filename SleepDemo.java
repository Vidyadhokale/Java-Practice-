class Demo extends Thread
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
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }
}
public class SleepDemo
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.start();
    }
}
