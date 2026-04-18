package ExceptionHandlingClass;

import java.util.Scanner;

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers for calculating average: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(a+" divided by  b is "+ c);
        }catch(ArithmeticException e){
            System.out.println("number cannot be divided by zero");
        }
    }
}
