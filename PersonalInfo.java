import java.util.*;
public class PersonalInfo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.next();
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        System.out.println("Enter Your Height:");
        double height=sc.nextDouble();
        System.out.println("**_Personal Information_**");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("height: " + height);
    }
}
