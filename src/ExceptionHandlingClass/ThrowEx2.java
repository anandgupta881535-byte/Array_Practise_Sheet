package ExceptionHandlingClass;

public class ThrowEx2 {
    static void checkEligibilty(int age){
        if(age<18){
            throw new ArithmeticException("Student is not eligible for Vote");
        }
        else{
            System.out.println("Student is eligible for vote");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Registration process!!");
        try {
            checkEligibilty(19);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Have a nice day...");
    }
}
