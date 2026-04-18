package ArraysCodingQuestions;

import java.util.Scanner;

public class Move_all_zero_to_end_without_changingOrder_ofOtherElement35 {

    public static void moveAllZeroes(int arr[], int n){
        int []result = new int[n];
        int i = 0;
        int index = 0;
        for(i = 0; i<n; i++){
            if(arr[i]!=0){
                result[index++] = arr[i];
            }
        }

        while(index<n){
            result[index++] = 0;

        }
        System.out.println("Array after moving zeroes at last: ");
        for(int j =0; j<n; j++){
            System.out.println(result[j]+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter all elements of the array: ");
        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        moveAllZeroes(arr, n);
    }
}
