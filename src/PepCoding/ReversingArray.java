package PepCoding;

import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter an array element:");
        for(int i=1;i<=n;i++){
            arr[i] =sc.nextInt();
        }
        for(int i =k;i!=1;i--){
            int temp = arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
        System.out.println(arr);
    }
}
