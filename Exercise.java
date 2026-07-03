public class Exercise {
    public static void main(String[] args) {
        System.out.println("For Loop: ");
        for(int i=1;i<=5;i++){
            System.out.print(i);
            if(i<5)
            System.out.print(" ");
            
        }
        System.out.print(" While Loop: ");
        int a=1;
        while(a<=5){
            System.out.print(a);
            if(a<5)
            System.out.print(" ");
            a++;
        }
        System.out.print(" Do-While Loop: ");
        int b=1;
        do {
            System.out.print(b);
            if(b<5)
            System.out.println(" ");
            b++;
            
        }while(b<=5);
    }
}
