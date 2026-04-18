package ArraysCodingQuestions;

import java.util.Scanner;

public class Sort_array_in_descending_order18 {

    public static void descendingSort(int arr[], int n){
        int temp;
        for(int i = 0; i < n-1; i++){   // outer loop
            for(int j = 1; j < n-i; j++){  // inner loop
                if(arr[j] > arr[j-1]){   // swap if current > previous
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int x:arr){
            System.out.print(x+"\t");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of an array: ");
        int []arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        descendingSort(arr, n);

    }
}
