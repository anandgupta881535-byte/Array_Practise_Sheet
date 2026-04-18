package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_the_largest_three_elements_inArray26 {

    public static void largest3Ele(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        int thilargest = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                thilargest = seclargest;
                seclargest = largest;
                largest = arr[i];
            }else if(arr[i]>seclargest && arr[i]!=largest){
                thilargest = seclargest;
                seclargest = arr[i];
            }else if(arr[i]>thilargest && arr[i]!=largest && arr[i]!=seclargest){
                thilargest = arr[i];
            }
        }
        System.out.println("Largest, Secnd-Largest, Third-Largest: "+largest+" "+ seclargest+" " +thilargest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        largest3Ele(arr, n);
    }
}
