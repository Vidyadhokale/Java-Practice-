import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorDemo
{
    public static void main(String args[])
    {
        ExecutorService service=Executors.newFixedThreadPool(3);
        service.execute(()->
        {
            System.out.println("Task 1 is Running");
        });
        service.execute(()->
        {
            System.out.println("Task 2 is Running");
        });
        service.execute(()->
        {
            System.out.println("Task 3 is Running");
        });
        service.shutdown();


    }
}
