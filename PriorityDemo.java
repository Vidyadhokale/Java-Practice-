class MyPriorityDemo1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1 is Running");
    }
}
class MyPriorityDemo2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2 is Running");
    }
}
public class PriorityDemo
{
    public static void main(String args[])
    {
        MyPriorityDemo1 m1=new MyPriorityDemo1();
        MyPriorityDemo2 m2=new MyPriorityDemo2();
        m1.setPriority(1);
        m2.setPriority(10);
        m1.start();
        m2.start();

    }
}
