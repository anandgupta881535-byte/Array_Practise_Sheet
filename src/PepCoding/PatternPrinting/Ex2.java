package PepCoding.PatternPrinting;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = n; j>=i; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
