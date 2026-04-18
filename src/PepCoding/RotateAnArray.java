package PepCoding;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class RotateAnArray {
    public static void reverseArray(int k, int brr[]){
        int i = brr.length-k;
        int j = brr.length-1;
        while(i<j) {
            int temp = brr[i];
            brr[i] = brr[j];
            brr[j] = temp;
            i++;
            j--;
        }

        for(int l =0; l<brr.length; l++){
                System.out.println(brr[l]);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
            k = k % arr.length;
        if(k<0) {
            k = k + arr.length;
        }
        reverseArray(k , arr);


    }
}
