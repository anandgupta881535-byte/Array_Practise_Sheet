package ArraysCodingQuestions;

import java.util.Scanner;
//Check if an array contains a given number .
public class Check_If_an_array_contains_GivenNumber7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for (int i =0; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Number to be Search: ");
        int b = sc.nextInt();;
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==b){
                System.out.println("index of Searched Element is: "+i);
                break;
            }
        }

    }
}
