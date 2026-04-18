package ArraysCodingQuestions;

import java.util.Scanner;

public class Copy_element_From_One_Array_toOther10 {
    public static int[] copyArray(int arr[], int n){
        int brr[] = new int[n];
        for (int i =0; i<n; i++){
            brr[i] = arr[i];
        }
        return brr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        int brr[] = copyArray(arr, n);
        for(int x: brr){
            System.out.print(x+"\t");
        }

    }
}
