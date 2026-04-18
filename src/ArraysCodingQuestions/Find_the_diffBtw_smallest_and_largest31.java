package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_the_diffBtw_smallest_and_largest31 {
    public static void diffLargAndSmallele(int []arr, int n){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Difference of Smallest and Largest are: "+ (largest-smallest));
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
        diffLargAndSmallele(arr,n);
    }
}
