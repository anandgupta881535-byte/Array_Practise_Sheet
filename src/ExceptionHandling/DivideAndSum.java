package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideAndSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a=0, b=0;
        try{
            int c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println("Divide of a and b is: "+ c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero");
            System.out.println("exception occur due to: "+e.getMessage());
        }
        catch(InputMismatchException m){
            System.out.println("please input digit only");
        }
       int d;
       d = a+b;
       System.out.println("sum is "+ d);
    }

}
