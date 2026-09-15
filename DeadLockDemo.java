public class DeadLockDemo
{
    static Object resource1=new Object();
    static Object resource2=new Object();
    public static void main(String args[])
    {
        Thread t1=new Thread(()->
        {
            synchronized (resource1)
            {
                System.out.println("Thread1 Loacked Resource1");
                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                synchronized (resource2)
                {
                    System.out.println("Thread1 Loacked Resource2");
                }
            }
        });
        Thread t2=new Thread(()->
        {
            synchronized(resource2)
            {
                System.out.println("Thread2 Locked Resource2");
                synchronized(resource1)
                {
                    System.out.println("Thread2 Locked Resource1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
