package ArraysCodingQuestions;

import java.util.Scanner;

public class Check_If_Arr_is_Sorted33 {
    public static boolean isSortedAsce(int arr[], int n){
        for (int i =0; i<n-1;i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedDece(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter an elements inside array: ");
        int [] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted;

        if(isSortedAsce(arr, n)){
            System.out.println("Array is sorted in ascending order");
        }else if(isSortedDece(arr,n)){
            System.out.println("Array is sorted in descending order");
        }else{
            System.out.println("Array is not sorted!");
        }

    }


}
