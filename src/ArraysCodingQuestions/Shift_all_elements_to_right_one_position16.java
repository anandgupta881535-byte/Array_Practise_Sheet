package ArraysCodingQuestions;

import java.util.Scanner;

public class Shift_all_elements_to_right_one_position16 {
    public static void RightShift(int arr[], int n ){
        int lastElem = arr[n-1];
        for (int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElem;
        System.out.println("array element after right shift");
        for (int x:arr){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        RightShift(arr, n);
    }
}
