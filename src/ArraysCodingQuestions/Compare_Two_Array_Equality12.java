package ArraysCodingQuestions;

import java.util.Scanner;

public class Compare_Two_Array_Equality12 {
    public static boolean compareArray(int arr[], int brr[], int n){
        int i = 0;
        boolean flag = true;
        while(i<n){
            if(arr[i] != brr[i]){
                flag = false;
                break;
            }
            i++;
        }
        return  flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        int []brr = new int[n];
        System.out.println("Enter the element of first Array: ");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element of Second Array: ");
        for(int i =0; i<n;i++){
            brr[i] = sc.nextInt();
        }
        boolean flag = compareArray(arr, brr, n);
        System.out.println((flag==true)?"Array are Equal":"Array are not Equal");
    }
}
