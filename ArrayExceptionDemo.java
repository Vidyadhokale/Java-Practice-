import java.util.*;
public class ArrayExceptionDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60};
        System.out.println("Enter Array Index:");
        int index=sc.nextInt();
        try
        {
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Array Index");
        }
    }
}
