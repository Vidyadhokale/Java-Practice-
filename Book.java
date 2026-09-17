public class Book
{
    String title;
    String author;
    double price;
    Book()
    {

    }
    Book(String title)
    {
        this.title=title;
    }
    Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
        System.out.println();
    }
    public static void main(String args[])
    {
        Book b1=new Book();
        b1.display();
        Book b2=new Book("Python");
        b2.display();
        Book b3=new Book("Python","Guido-Van-Rossum",2000);
        b3.display();
    }
}
