package ExceptionHandlingClass;

import java.util.Scanner;

public class NumberFormatExceptionEX5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age of Person:");
        String a = sc.next();
        try {
           int age = Integer.parseInt(a);
            System.out.println("Age of Person is:"+a);

            System.out.println("square of number is "+ Math.pow(age,2) );
        }catch (NumberFormatException e){
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
