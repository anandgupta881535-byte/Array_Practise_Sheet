package ExceptionHandlingClass;

import java.sql.SQLOutput;

public class ThrowEx1 {
    static void checkEligibilty(int stuage, int stuweight){
        if(stuage<12 && stuweight<40){
            throw new ArithmeticException("Student is not eligible for registratio n");
        }
        else{
            System.out.println("Student Entry is Valid!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Registration process!!");
        checkEligibilty(10,39);
        System.out.println("Have a nice day...");
    }
}
