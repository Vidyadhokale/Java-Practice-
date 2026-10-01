import java.util.*;
public class  EmployeeTaskList
{
    public static void main(String args[])
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Complete Java");
        list.add("Practice SQL");
        list.add("Learn Python");
        list.add("Update Github");
        System.out.println("All Task :"+list);
        System.out.println("Index One Task :"+list.get(1));
        list.set(2,"Practice Python");
        System.out.println("Updated Task :"+list);
        System.out.println("Complete Java In Task :"+list.contains("Complete Java"));
        list.remove("Update Github");
        System.out.println("Removed Update Github From Task :"+list);
        System.out.println("Total Task :"+list.size());

    }    
}
