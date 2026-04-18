package PepCoding.ArrayExampless;

import java.util.Scanner;
//Enter a2 as a largest element compare to both value and length wise also
public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //smallest value a1
        int n1 = sc.nextInt();
        int []a1 = new int[n1];
        for(int i =0; i<n1; i++){
            a1[i] =sc.nextInt();
        }
        //largest value a2
        int n2 = sc.nextInt();
        int []a2 = new int[n2];
        for(int i =0; i<n2; i++){
            a2[i] =sc.nextInt();
        }
        int []diff = new int[n2];
        int i = a1.length -1;
        int j = a2.length -1;
        int k = diff.length -1;
        int c =0;
        while(k>=0){
            int d = 0;
            int a1v = i>=0?a1[i]:0;
            if(a2[j] +c >= a1v){
                d = a2[j] + c - a1v;
                c = 0;
            }else{
                d = a2[j] + 10 + c - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;

        }
        int idx = 0;
                while(idx <diff.length){
                    if (diff[idx] == 0){
                        idx++;
                    }else{
                        break;
                    }
                }
                while(idx < diff.length){
                    System.out.println(diff[idx]);
                    idx++;
                }

    }
}
