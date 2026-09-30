import java.util.*;
public class ArrayListDemo2 
{
public static void main(String args[])
{
    ArrayList <String>list=new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");
    System.out.println("Original List :"+list);
    System.out.println("Index Two Element :"+list.get(2));
    list.set(1,"Grapes");
    System.out.println("Updated List :"+list);
    System.out.println("Check Apple in List :"+list.contains("Apple"));
    System.out.println("Size of List :"+list.size());
    list.remove("Orange");
    System.out.println("Removed Orange From List :"+list);
    System.out.println("Final List :"+list);
}    
}
