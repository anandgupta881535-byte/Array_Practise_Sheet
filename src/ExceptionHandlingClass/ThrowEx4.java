package ExceptionHandlingClass;

import java.util.Scanner;

public class ThrowEx4 {
    static void checkEligibilty(String pin, int count){
        String str ="abc";
        if(pin.equals(str)){

            System.out.println("Login Successful.");
        }
        else {
           throw new ArithmeticException("Login UnSuccessful, Your Pin is Wrong!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Registration process!!");
        int count = 0;
        String str1="";
        do {
            System.out.println("Enter Your Pin:");
            String str = sc.next();
            checkEligibilty(str,count);
            count ++;
        }while(count<3);
        System.out.println(str1);
        System.out.println("Have a nice day...");
    }
}
