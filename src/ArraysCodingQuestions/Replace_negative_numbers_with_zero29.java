package ArraysCodingQuestions;

import java.util.Scanner;

public class Replace_negative_numbers_with_zero29 {
    public static void replaceNegNum(int []arr, int n){
        for(int i = 0; i<n; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        System.out.println("Array after replacing: ");
        for(int x : arr){
            System.out.print(x +"\t");
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
        replaceNegNum(arr,n);
    }
}
