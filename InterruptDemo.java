class MyInterruptdemo extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e)
        {
            System.out.println("Thread is Interrupted");
        }

    }
}
public class InterruptDemo
{
    public static void main(String args[])
    {
        MyInterruptdemo d=new MyInterruptdemo();
        d.start();
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
        d.interrupt();
    }
}
