package ArraysCodingQuestions;

import java.util.Scanner;

//Count the Occurence of a specific element.
public class Count_Occurence_Of_element5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Number to find Occurence :");
        int num = sc.nextInt();
        int count =0;
        for (int i = 0; i<n; i++){
           if(arr[i] == num ){
               count++;
           }

        }
        System.out.println("Frequency of Occurence of given number is: "+ count);
    }
}
