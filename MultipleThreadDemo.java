public class MultipleThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Thread is Running");
    }

    public static void main(String args[])
    {
        MultipleThreadDemo t1=new MultipleThreadDemo();
        MultipleThreadDemo t2=new MultipleThreadDemo();
        t1.start();
        t2.start();
    }
}
