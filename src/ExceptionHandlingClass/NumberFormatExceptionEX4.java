package ExceptionHandlingClass;

import java.util.Scanner;

public class NumberFormatExceptionEX4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        try {
            String a = sc.next();
//            if(a>25){
//                throw NumberFormatException;
//            }
//           for(int i = 1; i<=10; i++) {
//               System.out.println(a + " * " + i + " = " + a * i);
//           }

        }catch (NumberFormatException e){
            System.out.println("Given input is not a number.");
        }
    }
}
