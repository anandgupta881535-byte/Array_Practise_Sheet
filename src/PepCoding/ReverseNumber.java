package PepCoding;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b=0;
        while(a!=0){
            b = b*10+a%10;
            a/=10;
        }
        System.out.println(b);
    }
}
