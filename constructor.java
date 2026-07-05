class Human
{
    private int age;
    private String name;

    public Human()
    {
        age=20;
        name="pras";
    }
    public Human(int age,String name)
    {
        age=age;
        name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(){
        this.name=name;
    }


}


public class constructor {
    public static void main(String[] args)
    {
        Human obj=new Human();
        Human obj1=new Human(18,"naveen");
        System.out.println(obj.getName() + ":"+ obj.getAge());
    }
    
}
