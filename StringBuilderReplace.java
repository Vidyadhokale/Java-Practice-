import java.util.*;
public class StringBuilderReplace
{
    public static void main(String args[])
    {
        String str="Hello Java";
        System.out.println("Original String:"+str);
        StringBuilder sb=new StringBuilder(str);
        sb.replace(6,10,"Python");
        System.out.println("Replace String:"+sb);
    }
}
