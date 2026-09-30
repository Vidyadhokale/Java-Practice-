import java.util.*;
public class ListDemo 
{
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List :"+list);
        System.out.println("Index Two Element :"+list.get(2));
        list.set(2,35);
        System.out.println("Updated List :"+list);
        System.out.println("40 Is Present in List :"+list.contains(40));
        System.out.println("Final List :"+list);
    }    
}
