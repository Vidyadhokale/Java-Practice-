import java.lang.*;
public class Student
{
    Student(String name,int age)
    {

        System.out.println("Name:"+name+  "Age:"+age);
    }
    public static void main(String args[])
    {
        Student s=new Student("vidya ",22);
    }
}
