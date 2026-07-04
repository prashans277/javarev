class Student{
    int rollno;
    String name;
    int marks;
}
public class enhancedforloop {
    public static void main(String[] args){
        Student s1=new Student();
        s1.rollno=1;
        s1.name="amar";
        s1.marks=50;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="Bharat";
        s2.marks=55;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="Bharat";
        s3.marks=65;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student stud:students){
            System.out.println(stud.name+ ":"+stud.marks);
        }
    }
    
}

