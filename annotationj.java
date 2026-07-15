// class A{
//     public void ShowTheData(){
//         System.out.println("in a show");
//     }
// }
// class B extends A{
//     public void ShowTheData(){
//         System.out.println("in A show");
//     }
// }
// public class annotationj {
//     public static void main(String[] args){
//         B obj=new B();
//         obj.ShowTheData();
//     }
    
// }


interface A{
    void show();
    
}
// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }

// }

public class annotationj {
    public static void main(String[] args)
    {
        A obj=new A()
        {
            public void show(){
                System.out.println("ina show");
            }
        };
        obj.show();
    }

}