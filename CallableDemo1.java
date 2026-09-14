import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo1 implements Callable<Integer>
{
    public Integer call() throws Exception
    {
        return 100;
    }
    public static void main(String args[])
    {
        ExecutorService service= Executors.newFixedThreadPool(2);
        CallableDemo1 cd=new CallableDemo1();
        Future<Integer> fi=service.submit(cd);
        try
        {
            System.out.println("Future Integer:"+fi.get());
        }catch(Exception e)
        {
            System.out.println(e);
        }

        service.shutdown();
    }
}
