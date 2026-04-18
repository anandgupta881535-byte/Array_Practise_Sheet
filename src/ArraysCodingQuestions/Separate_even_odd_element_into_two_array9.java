package ArraysCodingQuestions;

import java.util.Scanner;

public class Separate_even_odd_element_into_two_array9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;
        System.out.println("Enter an array element of "+n+": ");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                count++;
            }
        }
        int []evenArr = new int[count];
        int []oddArr = new int[n-count];
        int j = 0;
        int k =0;
        for (int i =0; i<n; i++){
            if(j<count && arr[i]%2==0){
                evenArr[j++] = arr[i];
            }else if(k<(n-count)){
                oddArr[k++] =arr[i];
            }

        }
        System.out.println("even array are: ");
        for(int x: evenArr){
            System.out.print(x+"/t");
        }
        System.out.println();
        System.out.println("odd array are: ");
        for(int y: oddArr){
            System.out.print(y+"/t");
        }
    }
}
