enum Status{
    Running ,Failed,Pending,Sucess;
}
public class enumerationw {
    public static void main(String[] args){
        int i=5;
        Status[] ss=Status.values();
        for (Status s: ss){
        System.out.println(s);
        System.out.println(s.ordinal());}
    }
}
