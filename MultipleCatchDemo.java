import java.util.*;
public class MultipleCatchDemo
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50,60,70};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array index:");
        int index=sc.nextInt();
        try
        {
            System.out.println(arr[index]);
            System.out.println(arr[index]/0);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Array Index");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not Divide by Zero");
        }
    }
}
