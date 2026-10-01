import java.util.*;
public class HashSetDemo 
{
    public static void main(String args[])
    {
        HashSet <String> student=new HashSet<>();
        student.add("Amit");
        student.add("Riya");
        student.add("Neha");
        student.add("Amit");
        student.add("Rahul");
        student.add("Riya");
        System.out.println("\n"+"Student Set :"+student+"\n");
        System.out.println("Student Set Size :"+student.size()+"\n");
        System.out.println("In Student Set Neha Exist :"+student.contains("Neha")+"\n");
        System.out.println("In Student Set Pooja Exist :"+student.contains("Pooja")+"\n");
        student.remove("Rahul");
        System.out.println("After Removing Rahul From Student Set :"+student);
    }    
}
