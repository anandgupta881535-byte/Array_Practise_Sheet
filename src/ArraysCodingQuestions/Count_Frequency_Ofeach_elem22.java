package ArraysCodingQuestions;

import java.util.Scanner;

public class Count_Frequency_Ofeach_elem22 {
    public static void countOccuranceOfele(int []arr, int n){
        boolean []visited = new boolean[n];
        int count ;
        for(int i = 0; i<n; i++) {
            if (visited[i]) {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + "->"+count);
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
       countOccuranceOfele(arr, n);
    }
}

