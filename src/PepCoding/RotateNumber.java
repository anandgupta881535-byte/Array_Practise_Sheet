package PepCoding;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int count = 0;
        int temp = n;
        while(temp>0){
            temp = temp / 10;
            count++;
        }
        k = count/k;
        if (k<0){
            k = k+count;
        }
        int div = 1;
        int mult = 1;
        for (int i=1;i<=count;i++){
            if (i<=k){
                div = div*10;
            }
            else
                mult = mult*10;
        }
        int q = n/div;
        int r = n%div;

        int result = r*mult + q;
        System.out.println(result);
    }


}
