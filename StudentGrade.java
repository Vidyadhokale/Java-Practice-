import java.util.*;
public class StudentGrade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks:");
        int marks=sc.nextInt();
        if (marks >=75)
        {
            System.out.println("Distinction");
        }
        else if (marks >=60)
        {
            System.out.println("First Class");
        }
        else if (marks >=40)
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
