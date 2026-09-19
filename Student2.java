public class Student2
{
    private String name;
    private int marks;
    public void setName(String name)
    {
        this.name=name;
        
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
        
    }
    public String getName()
    {
        return name;
    }
    public int getMarks()
    {
        return marks;
    }

     public static void main(String args[])
    {
        Student2 s=new Student2();
        s.setName("Vidya");
        s.setMarks(85);
        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }    
}
