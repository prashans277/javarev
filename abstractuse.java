abstract class Car 
{
    public abstract void drive();
    public abstract void fly();

    public void PlayMusic(){
        System.out.println("Play music");
    }

}
abstract class WagnoR extends Car
{
    public void drive(){
        System.out.println("Driving....");
    }
}
class UpdateWagnoR extends WagnoR{
    @Override
    public void fly(){
        System.out.println("Flying");
    }
}


public class abstractuse

{
    public static void main(String[] args){
        Car obj=new UpdateWagnoR();
        obj.drive();
        obj.PlayMusic();

    }
    
}
