import java.util.*;

public class LinkedListDemo1 
{
    public static void main(String args[])
    {
        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Number:");
        int n=sc.nextInt();
        System.out.println("Enter Actual Number:");
        for(int i=0;i<n;i++)
        {
            int name=sc.nextInt();
            list.add(name);
        }
        System.out.println("Linked List :"+list);
    }        
}
