class Mobile
{
    String brand;   //instance varibale
    static String name;   //use of static keyword
    int price;

    public void show(){
        System.out.println(brand+" : "+name+" : "+price);  //local variable
    }
}
public class staticvariable {
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.brand="apple";
        Mobile.name="iphone14";
        obj1.price=52000;

        Mobile obj2=new Mobile();
        obj2.brand="samsung";
        Mobile.name="s22ultra";
        obj2.price=55000;
        obj1.show();
        obj2.show();
    }
    
}
