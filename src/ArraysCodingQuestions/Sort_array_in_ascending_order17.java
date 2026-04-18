package ArraysCodingQuestions;

import java.util.Scanner;

public class Sort_array_in_ascending_order17 {
    public static void ascendingSort(int []arr, int n){
        int temp ;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x: arr){
            System.out.print(x+ "\t");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter an element for an array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ascendingSort(arr, n);
    }
}
