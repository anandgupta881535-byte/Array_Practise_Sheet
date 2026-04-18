package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_the_sum_of_even_and_sum_of_odd28 {

    public static void sumOfEvenAndOdd(int []arr, int n){
        int sumOfeven = 0;
        int sumOfOdd = 0;
        for(int i =0; i<n; i++){
            if(arr[i]%2 == 0){
                sumOfeven+=arr[i];
            }else{
                sumOfOdd+=arr[i];
            }
        }
        System.out.println("Sum Of Even: "+ sumOfeven);
        System.out.println("Sum of Odd: "+ sumOfOdd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sumOfEvenAndOdd(arr,n);
    }
}
