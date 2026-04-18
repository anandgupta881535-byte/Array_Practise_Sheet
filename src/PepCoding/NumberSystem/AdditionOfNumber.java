package PepCoding.NumberSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.reverse;

public class AdditionOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = 0;
        int car = 0;
        int d1= 0;
        int d2 = 0;
        int sum = 0;
        while(n1>0 || n2>0){
          d1 = n1%10;
          d2 = n2%10;
          n1 = n1/10;
          n2 = n2/10;

          sum = (d1+d2 + car)%10;
            System.out.println(sum);
            if((d1+d2)>10){
                car =(d1+d2)/10;
            }

        }

    }
}
