import java.util.*;
public class EligibilityCheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        System.out.println("Enter Your Marks:");
        int marks=sc.nextInt();
        if(age>=18 && marks >=40)
        {
            System.out.println("Age >=18 : True");
            System.out.println("Marks >=40 : True");
            System.out.println("Eligible: True");
        }
        else
        {
            System.out.println("Eligible: False");
        }
    }
}
