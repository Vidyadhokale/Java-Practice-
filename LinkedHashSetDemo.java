import java.util.*;
public class LinkedHashSetDemo
{
    public static void main(String args[])
    {
        LinkedHashSet<String> courses=new LinkedHashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("SQL");
        courses.add("HTML");
        courses.add("Java");
        courses.add("SQL");
        System.out.println("Courses :"+courses);
        System.out.println("In Courses Python is Exists :"+courses.contains("Python"));
        courses.remove("HTML");
        System.out.println("Courses After Removing HTML :"+courses);
        System.out.println("Total Courses :"+courses.size());
    }    
}
