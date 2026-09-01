public class ThrowDemo
{
    public static void main(String args[])
    {
        int age=15;
        try
        {
            if(age <= 18)
            {
                throw new ArithmeticException("Age is must be Greter Than 18");
            }
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
