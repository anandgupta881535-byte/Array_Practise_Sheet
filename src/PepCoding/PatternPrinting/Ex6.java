package PepCoding.PatternPrinting;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc = 1;
        int str = n/2+1;
        for (int i = 1;i<=n; i++){
           // System.out.println(str + " " + spc + " "+ str);
            for (int j = 1; j<=str; j++){
                System.out.print("*\t");
            }
            for (int j = 1; j<=spc; j++){
                System.out.print("\t");
            }
            for (int j = 1; j<=str; j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                spc+=2;
                str--;
            }else{
                spc-=2;
                str++;
            }
        }
    }
}
