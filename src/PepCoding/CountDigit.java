package PepCoding;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int count=0;
        while(a!=0){
            a = a/10;
            count++;
        }
        System.out.println(count);

    }
}
