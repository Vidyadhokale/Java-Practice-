public class StringComparison 
{
    public static void main(String args[])
    {
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Python";
        System.out.println("Str1 == Str2 :"+(str1==str2));  //true
        System.out.println("Str1 == Str3 :"+(str1==str3));  //false
        System.out.println("Str1.equals(str3) :"+ str1.equals(str3));   //true
        System.out.println("Str1.equals(Str4) :"+ str1.equals(str4));   //false
    }    
}
