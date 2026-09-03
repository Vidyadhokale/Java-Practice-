import java.util.*;
class InvalidMarksException extends Exception
{
    InvalidMarksException(String msg)
    {
        super(msg);
    }
}
public class MarksValidationDemo
{
    static void ValidatMarks(int marks)throws InvalidMarksException
    {
        if(marks <0 || marks >100)
        {
            throw new InvalidMarksException("Marks are Invalid");
        }
        else
        {
            System.out.println("Valid Marks");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Marks:");
        int marks=sc.nextInt();
        try
        {
            ValidatMarks(marks);
        } catch(InvalidMarksException e)
        {
            System.out.println(e);
        }
    }
}
