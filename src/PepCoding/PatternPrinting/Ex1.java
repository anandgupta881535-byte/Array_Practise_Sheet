package PepCoding.PatternPrinting;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n ; i++){
            for (int j = i; j>=1; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
