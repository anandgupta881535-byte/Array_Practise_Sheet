package ArraysCodingQuestions;

import java.util.Scanner;

public class Rotate_an_array_by_k_position_totheRight24 {
    public static void reverse(int arr[], int a, int b){
        int i = a;
        int j = b;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }
    public static void rotateAnArrToRight(int arr[], int n, int k){
        k = k % n; // handle cases where k > n
        // Step 1: reverse whole array
        reverse(arr, 0, n-1);
        // Step 2: reverse first k elements
        reverse(arr, 0, k-1);
        // Step 3: reverse remaining n-k elements
        reverse(arr, k, n-1);

        for(int x: arr){
            System.out.print(x + "\t");
        }

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
        System.out.println("Enter the value of K, for rotating an array by k to the right position: ");
        int k = sc.nextInt();
        rotateAnArrToRight(arr,n,k);
    }
}
