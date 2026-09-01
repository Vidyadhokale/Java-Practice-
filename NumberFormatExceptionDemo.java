public class NumberFormatExceptionDemo
{
    public static void main(String args[])
    {
        String str="abc";
        try
        {
            System.out.println("String to Number Conversion:"+Integer.parseInt(str));
        }catch(NumberFormatException e)
        {
            System.out.println("Invalid Number Format");
        }
    }
}
