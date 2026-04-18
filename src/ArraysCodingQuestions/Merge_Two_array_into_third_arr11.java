package ArraysCodingQuestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Merge_Two_array_into_third_arr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int a = sc.nextInt();
        int []arr = new int[a];
        System.out.println("Enter size of Second array: ");
        int b = sc.nextInt();
        int []brr = new int[b];
        System.out.println("Enter the elements contain in first array: ");
        for (int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements contain in Second array: ");
        for (int i = 0; i<b; i++){
            brr[i] = sc.nextInt();
        }
        System.out.println("After merging first and second element the array become: ");
        int []crr = new int[a+b];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<a+b){
           if(j<a){
               crr[i] = arr[j++];
           }else if(k<b){
               crr[i] = brr[k++];
           }
           i++;
        }
        for(int x: crr){
            System.out.print(x + "\t");
        }

    }
}
