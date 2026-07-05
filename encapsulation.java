class Human
{
    private int age;
    private String name;
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }

}
public class encapsulation {
    public static void main(String[] args){
        Human obj=new Human();
        obj.setAge(30);
        obj.setName("prashans");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
    
}
