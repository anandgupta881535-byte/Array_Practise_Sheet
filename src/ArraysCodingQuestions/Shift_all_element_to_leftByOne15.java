package ArraysCodingQuestions;

import java.util.Scanner;

public class Shift_all_element_to_leftByOne15 {
    public static void shiftEleToLeft(int arr[]){
        int first = arr[0]; // store first element
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1]; // shift left
        }
        arr[arr.length - 1] = first; // put first element at end

        System.out.println("Array after shifting left:");
        for(int x: arr){
            System.out.print(x + "\t");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    shiftEleToLeft(arr);
    }
}
