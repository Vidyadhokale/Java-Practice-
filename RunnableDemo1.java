public class RunnableDemo1 implements Runnable
{
    public void run()
    {
        System.out.println("Runnable Interface is Running");
    }
    public static void main(String args[])
    {
        RunnableDemo1 rd=new RunnableDemo1();
        Thread t=new Thread(rd);
        t.start();
    }
}
