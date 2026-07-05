class Mobile
{
    String brand;   //instance varibale
    static String name;   //use of static keyword
    int price;

    static{
        name="phone";
        System.out.println("in static block");
    }

    public void show(){
        System.out.println(brand+" : "+name+" : "+price);  //local variable
    }
    

    public Mobile(){
        brand="";
        price=20000;
        System.out.println("in const");
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+name+" : "+obj.price);
    }
}
public class staticblock {
    public static void main(String[] args)throws ClassNotFoundException{
        Class.forName("Mobile");
    //     Mobile obj1=new Mobile();
    //     obj1.brand="apple";
    //     Mobile.name="iphone14";
    //     obj1.price=52000;

    //     Mobile obj2=new Mobile();
    //     obj2.brand="samsung";
    //     Mobile.name="s22ultra";
    //     obj2.price=55000;
    //     obj1.show();
    //     obj2.show();

    //     Mobile.name="phone";
    //     Mobile.show1(obj1);
     }
    
}

