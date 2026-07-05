class A
{
    public A(){
        System.out.println("object creative");
    }
    public void show()
    {
        System.out.println("in a show");
    }

}

public class anonymousobject
{
    public static void main(String[] args)
    {
        new A().show();
        new A().show();
        // int marks;
        // marks=99;
        // A obj;
        // obj=new A();
        // obj.show();

    }

}