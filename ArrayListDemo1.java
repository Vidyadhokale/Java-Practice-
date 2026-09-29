import java.util.*;

public class ArrayListDemo1 
{
    public static void main(String args[])
    {
        ArrayList <String> List=new ArrayList<>();
        List.add("Riya");
        List.add("Pihu");
        List.add("Swara");
        List.add("Vidya");
        List.add("Aaru");
        System.out.println("List :"+List);
        List.add("Prem");
        System.out.println("New Updated List :"+List);
        System.out.println("Size of List :"+List.size());
        List.remove("Riya");
        System.out.println("After Removing List :"+List);
    }    
}
