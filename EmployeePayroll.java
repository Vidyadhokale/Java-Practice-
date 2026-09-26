class Employee
{
    private double salary;
    protected double calculateBonus()
    {
        return salary * 10/100;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public void displaySalary()
    {
        System.out.println("Salary :"+salary);
    }
}
class Manager extends Employee
{
    public void showBonus()
    {
        System.out.println("Bonus :"+super.calculateBonus());
    }
}
public class EmployeePayroll 
{
    public static void main(String args[])
    {
        Manager m=new Manager();
        m.setSalary(50000);
        m.displaySalary();
        m.showBonus();
    }   
}
