package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_Second_Largest_Element19 {

    public static int secondLargestElem(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
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
        System.out.println(secondLargestElem(arr, n));
    }
}
