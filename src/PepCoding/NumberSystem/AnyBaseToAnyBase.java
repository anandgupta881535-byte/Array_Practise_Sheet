package PepCoding.NumberSystem;

import java.util.Scanner;

    public class AnyBaseToAnyBase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            double sum = 0;
            int rem = 0;

            for(int i =0; n>0; i++) {
                rem = n % b2;
                sum = sum + rem * Math.pow(b1, i);
                n = n / b2;
            }
            System.out.println(sum);

        }
    }


