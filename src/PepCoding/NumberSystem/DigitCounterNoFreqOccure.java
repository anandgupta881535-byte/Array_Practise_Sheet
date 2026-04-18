package PepCoding.NumberSystem;

import java.util.Scanner;
//Decimal to any base
public class DigitCounterNoFreqOccure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int b = sc.nextInt();
        int rem = 0;
        double sum = 0;

        for(int i =0; n>0; i++) {

            rem = n % b;
            sum += rem * Math.pow(10,i);
            n = n / b;

        }

        System.out.println(sum);
    }
}
