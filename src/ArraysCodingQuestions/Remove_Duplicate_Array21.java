package ArraysCodingQuestions;

import java.util.Scanner;

public class Remove_Duplicate_Array21 {
    public static void RemoveDuplicate(int arr[], int n){
        boolean isDuplicate;
        for (int i = 0; i<n; i++){
            isDuplicate = false;
            for (int j = 0; j<i; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+"\t");
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter element inside array: ");
        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        RemoveDuplicate(arr, n);
    }
}
