// public class exceptionhandle {
//     public static void main(String[] args){
//         int i=0;
//         int j=0;
//         try{
//             j=18/i;
//         }
//         catch(Exception e){
//             System.out.println("something went wrong"+e);
//         }
//         System.out.println(j);
//         System.out.println("Byee. ");
//     }
// }



class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Exercise {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}