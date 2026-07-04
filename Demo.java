class Calculator
{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,int b){
        return a+b;
    }

}
public class Demo 
{
    public static void main(String[] args)
    {
        Calculator obj=new Calculator();
        int r1=obj.add(3,4);
        System.out.print(r1);

    }

}