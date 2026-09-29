import java.util.*;
public class LinkedListDemo 
{
    public static void main(String args[])
    {
        LinkedList<String> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Name:");
        int n=sc.nextInt();
        System.out.println("Enter Actual Name:");
        for(int i=0;i<n;i++)
        {
            String name=sc.next();
            list.add(name);
        }
        System.out.println("Linked List :"+list);
    }    
}
