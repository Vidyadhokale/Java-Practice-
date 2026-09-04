public class ThreadNameDemo extends Thread
{
    public void run()
    {
        System.out.println("Current Thread is:"+Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        ThreadNameDemo t1=new ThreadNameDemo();
        ThreadNameDemo t2=new ThreadNameDemo();
        t1.start();
        t2.setName("MyThread");
        t2.start();

    }
}
