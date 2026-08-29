import java.util.*;
public class StringCompare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String:");
        String str1=sc.next();
        System.out.println("Enter Second String:");
        String str2=sc.next();
        System.out.println("String Equal:"+str1.equals(str2));
    }
}
