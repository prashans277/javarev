class A 
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class upcasting {
    public static void main(String[] args){
        A obj= (A) new B();
        obj.show1();
    }
}
