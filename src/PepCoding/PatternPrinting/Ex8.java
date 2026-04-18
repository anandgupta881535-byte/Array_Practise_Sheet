package PepCoding.PatternPrinting;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for (int j =1; j<=n; j++){
                if(i+j ==6){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
