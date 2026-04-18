package PepCoding;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[]= new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int idx = -1;
        for(int i = 0; i<n; i++){
            if (arr[i] == a){
                idx = i;
                break;
            }

        }
        System.out.println(idx);
    }
}
