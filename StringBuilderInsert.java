import java.util.*;
public class StringBuilderInsert
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.insert(5," Java ");
        System.out.println(sb);
    }
}
