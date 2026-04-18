package ArraysCodingQuestions;

import java.util.Scanner;

public class Search_for_Given_element4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter Number to be Search: ");
        int b = sc.nextInt();;
        int []arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==b){
                System.out.println("index of Searched Element is: "+i);
                break;
            }
        }

    }
}
