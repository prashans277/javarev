// interface A{
//     void show();
//     void config();

// }
// interface X
// {
//     void run();
// }
// class B implements A
// {
//     public void show(){
//         System.out.println("in a shhow");
//     }
//     public void config(){
//         System.out.println("in a config");
//     }
//     public void run(){
//         System.out.println("is running");
//     }
// }

// public class interfacej {
//     public static void main(String[] args)
//     {
//         A obj;
//         obj=new B();
//         obj.show();;
//         obj.config();

//     }
    
    
// }


class Computer {
    public void code() {
        System.out.println("Coding...");
    }
}

class Laptop extends Computer {
    @Override
    public void code() {
        System.out.println("Code, compile, run");
    }
}

class Desktop extends Computer {
    @Override
    public void code() {
        System.out.println("Code, compile, run on Desktop");
    }
}

class Developer {
    public void devApp(Computer computer) {
        computer.code();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer prashans = new Developer();

        prashans.devApp(lap);   // Calls Laptop's code()
        prashans.devApp(desk);  // Calls Desktop's code()
    }
}