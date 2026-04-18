package ArraysCodingQuestions;

import java.util.Scanner;

public class Reverse_an_array_in_place_without_using_extra_space23 {

    public static void rotateAnArray(int arr[], int n){
        int i = 0;
        int j = arr.length-1;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int x: arr){
            System.out.print(x+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter an element for an array: ");
        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        rotateAnArray(arr,n);
    }
}
