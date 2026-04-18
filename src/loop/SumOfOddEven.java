package loop;

import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {

        System.out.println("Enter an integer:");
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int sumOfEven=0,sumOfOdd=0;
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
            if (i%2==0){
                sumOfEven += i ;
            }
            else{
                sumOfOdd += i;
            }
        }
        System.out.println();
        System.out.println("Sum of even number:"+sumOfEven);
        System.out.println("Sum of odd number:"+sumOfOdd);
    }
}
