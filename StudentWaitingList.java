import java.util.*;
public class StudentWaitingList 
{
    public static void main(String args[])
    {
        LinkedList <String> list=new LinkedList<>();
        list.add("Amit");
        list.add("Riya");
        list.add("Neha");
        list.add("Rahul");
        System.out.println("Original List :"+list);
        list.addFirst("Pooja");
        System.out.println("Add Pooja First :"+list);
        list.addLast("Karan");
        System.out.println("Add Last Karan :"+list);
        System.out.println("First Student :"+list.getFirst());
        System.out.println("Last Student :"+list.getLast());
        list.remove("Riya");
        System.out.println("After Removing Riya Final List :"+list);
    }    
}
