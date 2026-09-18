public class Student1 
{
    String name;
    static String college="ASM";
    Student1(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }

    public static void main(String args[])
    {
        Student1 s=new Student1("Vidya");
        s.display();
        System.out.println(Student1.college);

        Student1 s1=new Student1("Rahul");
        s1.display();
        System.out.println(Student1.college);
    }    
}
