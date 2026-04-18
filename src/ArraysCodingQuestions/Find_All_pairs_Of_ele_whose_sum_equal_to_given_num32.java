package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_All_pairs_Of_ele_whose_sum_equal_to_given_num32 {

    public static void findPairsEqlTo(int arr[], int n, int k){
        System.out.println("Pairs are: ");
        for(int i =0; i<n; i++){
            for (int j = 0; j<n; j++){
                if(arr[i]+arr[j] == k){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
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
        System.out.println("Enter Number to find sum of pairs: ");
        int k = sc.nextInt();
        findPairsEqlTo(arr,n,k);
    }
}
