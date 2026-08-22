import java.util.*;
public class StudentInfo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.next();
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        System.out.println("Enter Your CGPA:");
        double cgpa=sc.nextDouble();
        System.out.println("Enter Your Grade:");
        char grade=sc.next().charAt(0);
        System.out.println("Enter IsStudent");
        boolean isstudent= sc.nextBoolean();
        System.out.println("**_Student Information_**");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isstudent);
    }
}
