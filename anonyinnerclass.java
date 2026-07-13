class A 
{
    public void show(){
        System.out.println("in a show");
    }
}
// class B extends A
// {
//     public void show()
//     {
//         System.out.println("in B show");
//     }
// }
public class anonyinnerclass 
{
    public static void main(String [] args)
    {
        A obj=new A()
        {
            public void show(){
                System.out.println("in a show");
            }
        };
        obj.show();
    }
    
}
