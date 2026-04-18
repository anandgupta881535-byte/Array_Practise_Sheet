package PepCoding.NumberSystem;

import java.util.Scanner;
//Any base to decimal
public class AnyBasetoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        double sum = 0;
        int rem = 0;

        for(int i =0; n>0; i++) {
            rem = n % 10;
            sum = sum + rem * Math.pow(b, i);
            n = n / 10;
        }
        System.out.println(sum);

    }
}
