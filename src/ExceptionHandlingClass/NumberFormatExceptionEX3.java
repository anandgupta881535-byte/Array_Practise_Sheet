package ExceptionHandlingClass;

import java.util.Scanner;

public class NumberFormatExceptionEX3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age of Person:");
        String a = sc.next();
        try {
           int age = Integer.parseInt(a);
            System.out.println("Age of Person is:"+a);
        }catch (NumberFormatException e){
            System.out.println("Given input is not a number.");
        }
    }
}
