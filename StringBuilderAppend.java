import java.util.*;
public class StringBuilderAppend
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        sb.append(" Programming");
        System.out.println(sb);
    }
}
