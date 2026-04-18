package PepCoding.ArrayExampless;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int toFind = sc.nextInt();
        int index = -1;
        for (int i =0; i<n; i++){
            if(arr[i] == toFind){
               index = i;
               break;
            }
        }
        System.out.println(index);
    }
}
