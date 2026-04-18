package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_Last_Occurance14 {
    public static void LastOccurance(int arr[], int n, int a){
        int target = a;
        int i ;
        for(i =n-1; i>=0; i--){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
        if(i == -1){
            System.out.println("No such element!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to find Last Occurance: ");
        int a = sc.nextInt();
        LastOccurance(arr, n, a);
    }
}
