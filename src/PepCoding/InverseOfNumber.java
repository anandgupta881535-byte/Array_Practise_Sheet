package PepCoding;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a,count=0,d;
        double b=0;
        a = kb.nextInt();
        while(a>0){
            count++;
            d = a%10;
            a = a/10;
            b = b + count*Math.pow(10,d-1);
        }
        System.out.println("Inverse of number is:"+b);
    }
}
