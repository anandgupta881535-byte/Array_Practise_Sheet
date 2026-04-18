package ArraysCodingQuestions;

import java.util.Scanner;

public class Count_How_many_ele_are_even_and_Odd8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;
        System.out.println("Enter an array element of "+n+": ");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                count++;
            }
        }
        System.out.println("Even number counts: "+count);
        System.out.println("Odd number counts: "+ (n-count));
    }

}
