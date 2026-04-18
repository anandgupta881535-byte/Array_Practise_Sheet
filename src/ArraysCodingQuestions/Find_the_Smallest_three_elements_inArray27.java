package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_the_Smallest_three_elements_inArray27 {

    public static void smallest3Ele(int arr[], int n){
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int thiSmallest = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]<smallest){
                thiSmallest = secSmallest;
                secSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secSmallest && arr[i]!= smallest){
                thiSmallest = secSmallest;
                secSmallest = arr[i];
            }else if(arr[i]< thiSmallest && arr[i]!= smallest && arr[i]!=secSmallest){
                thiSmallest = arr[i];
            }
        }
        System.out.println("Largest, Secnd-Largest, Third-Largest: "+ smallest +" "+ secSmallest+" " + thiSmallest);
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
        smallest3Ele(arr, n);
    }
}
