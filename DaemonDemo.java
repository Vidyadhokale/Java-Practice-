class DaemonThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
public class DaemonDemo
{
    public static void main(String args[])
    {
        DaemonThread d=new DaemonThread();
        d.setDaemon(true);
        d.start();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
