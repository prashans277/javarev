// class School{
//     private String name;
//     School(){
//         name="DPS";
//     }
//     void printSchoolName(){
//         System.out.println("Sc name"+name);
//     }
// }
// class Student extends School{
//     private String name;
//     Student(String name){
//         this.name=name;
//     }
//     void printStudentName(){
//         System.out.println("Student name : "+name);
//     }
   
// }
// class Parent extends Student{
//     private String name;
//     Parent(String name,String studentName){
//         super(studentName);
//         this.name=name;
//     }
//     void printParentName(){
//         System.out.println("Parent name: "+name);
//     }
// }
// public class inheritancetuf {
//     public static void main(String[] args){
//         Parent parent =new Parent("pras","raj");
//         parent.printStudentName();
//         parent.printParentName();
//         parent.printSchoolName();
    
// }
// }
class Product {
    private String name;
    private String category;
    private double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

class Electronic extends Product {
    private int warrantyPeriod;
    private String brand;

    Electronic(String name, double price, int warrantyPeriod, String brand) {
        super(name, "Electronics", price);
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

public class inheritancetuf {
    public static void main(String[] args) {

        Electronic e1 = new Electronic("Laptop", 65000, 2, "Dell");
        e1.displayDetails();

    }
}