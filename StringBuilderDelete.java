public class StringBuilderDelete
{
    public static void main(String args[])
    {
        String str="Hello Java";
        System.out.println("Original String:"+str);
        StringBuilder sb=new StringBuilder(str);
        sb.delete(6,10);
        System.out.println("After Delete String:"+sb);
    }
}
