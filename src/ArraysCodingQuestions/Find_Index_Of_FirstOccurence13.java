package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_Index_Of_FirstOccurence13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to Find it First Occurance in Array: ");
        int a = sc.nextInt();
        int i ;
        for (i = 0; i<n; i++){
            if(arr[i]==a){
                System.out.println("Index of Occurance: " +i);
                break;
            }
        }
        if(i == n){
            System.out.println("Not present!");
        }
    }
}
