import java.util.*;
class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
public class CustomExceptionDemo
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age:");
        int age = sc.nextInt();
        try
        {
            if (age < 18)
            {
                throw new InvalidAgeException("Age must be 18 or above");
            }
            else
            {
                System.out.println("Eligible for Voting");
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
