public class RunnableDemo implements Runnable
{
    public void run()
    {
        System.out.println("This is Runnable Interface");
    }
    public static void main(String args[])
    {
        RunnableDemo rb=new RunnableDemo();
        Thread t=new Thread(rb);
        t.start();
    }
}
