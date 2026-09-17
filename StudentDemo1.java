public class StudentDemo1
{
    String name;
    int age;
    String course;
    StudentDemo1(String name,int age,String course)
    {
        this.name=name;
        this.age=age;
        this.course=course;
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Course :"+course);
        System.out.println();
    }

    public static void main(String args[])
    {
        StudentDemo1 s1=new StudentDemo1("Vidya",22,"Msc(CS)");
        s1.display();
        StudentDemo1 s2=new StudentDemo1("Rahul",23,"Bsc(CS)");
        s2.display();
    }
}
