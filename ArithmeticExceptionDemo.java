import java.util.*;
public class ArithmeticExceptionDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=sc.nextInt();
        try
        {
            System.out.println("Division:"+num1/num2);
        }catch (ArithmeticException e)
        {
            System.out.println("Can not Divided by Zero");
        }
    }
}
