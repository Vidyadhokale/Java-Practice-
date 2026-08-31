import java.util.*;
public class StringBuilderReverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        System.out.println("Original String is:"+str);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("Reverse String is:"+sb);
    }
}
