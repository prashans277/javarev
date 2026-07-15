interface A{
    int add(int i,int j);
}

public class lambdavariable {
    public static void main(String[] args){
        A obj= (int i,int j)-> //lambda expression
        {
                return i+j;

            };
        
        int result=obj.add(5,4);
        System.out.println(result);

    }
    
}
