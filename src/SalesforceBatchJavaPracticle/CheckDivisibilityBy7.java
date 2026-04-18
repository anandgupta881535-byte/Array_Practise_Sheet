package SalesforceBatchJavaPracticle;

import java.util.Scanner;
// given a number, check if it is divisible by 7. You are not allowed to use  modulo operator, floating point arithmetic is also not allowed.
public class CheckDivisibilityBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ln = 0;
        while(num>0) {
            ln = num % 10;
            num = num / 10;
            num = num - 2 * ln;
        }
        if (num == -7 || num == 0 ){
            System.out.println("Divisible by 7");
        }else{
            System.out.println("Not Divisible by 7");
        }
    }
}
