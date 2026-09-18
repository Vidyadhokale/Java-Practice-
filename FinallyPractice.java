public class FinallyPractice 
{
    public static void main(String args[])
    {
        int a=10;
        int b=0;
        try
        {
            System.out.println("Division:"+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Not Divisible By Zero");
        }finally
        {
            System.out.println("Finally Block is Alwayes Executed");
        }
    }
}
