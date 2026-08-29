import java.util.*;
public class CharCount
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            count++;
        }
        System.out.println("Character Count:"+count);
    }
}
