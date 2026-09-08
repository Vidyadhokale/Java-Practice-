class YeildDemo extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            Thread.yield();
            System.out.println(i);
        }
    }
}
class YeildDemo2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
public class YieldDemo
{
    public static void main(String args[])
    {
        YeildDemo y=new YeildDemo();
        y.start();
        YeildDemo2 y2=new YeildDemo2();
        y2.start();
    }
}
