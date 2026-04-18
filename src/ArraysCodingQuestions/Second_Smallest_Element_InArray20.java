package ArraysCodingQuestions;

import java.util.Scanner;

public class Second_Smallest_Element_InArray20 {
    public static int secondSmallestElem(int arr[], int n) {
        int smallest = Integer.MAX_VALUE;
        int secdsmallest = Integer.MAX_VALUE;
        for(int i =0; i<n;i++) {
            if(arr[i]<smallest) {
                secdsmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secdsmallest && smallest!=arr[i]) {
                secdsmallest = arr[i];
            }
        }
        return secdsmallest;
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
        System.out.println(secondSmallestElem(arr, n));
    }

}
