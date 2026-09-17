public class Employee
{
    String name;
    int id;
    float salary;
    Employee()
    {

    }
    Employee(String name,int id,float salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("Salary :"+salary);
        System.out.println();
    }
    public static void main(String args[])
    {
        Employee e1=new Employee();
        e1.display();
        Employee e2=new Employee("Vidya",101,50000);
        e2.display();
    }
}
