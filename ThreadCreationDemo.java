public class ThreadCreationDemo extends Thread
{
    public void run()
    {
        System.out.println("Thread is Running");
    }
    public static void main(String args[])
    {
        ThreadCreationDemo thread=new ThreadCreationDemo();
        thread.start();
    }
}
