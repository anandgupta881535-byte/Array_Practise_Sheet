package PepCoding.PatternPrinting;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int spc = 0;
    int str = n;
    for(int i =1; i<=n; i++){
        //System.out.println(spc + " " + str);
        for (int j = 1; j<=spc; j++){
            System.out.print("\t");
        }
        for(int j = 1; j<=str; j++){
            System.out.print("*\t");
        }
    spc++;
    str--;
        System.out.println();
    }

    }
}
