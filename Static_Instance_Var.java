public class Static_Instance_Var 
{
    String name;
    static String college="ASM";
    Static_Instance_Var(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Static_Instance_Var s1=new Static_Instance_Var("Vidya");
        s1.display();
        System.out.println(Static_Instance_Var.college);
        Static_Instance_Var s2=new Static_Instance_Var("Rahul");
        s2.display();
        System.out.println(Static_Instance_Var.college);
        Static_Instance_Var.college="PVP";
        System.out.println(Static_Instance_Var.college);
    }
}
