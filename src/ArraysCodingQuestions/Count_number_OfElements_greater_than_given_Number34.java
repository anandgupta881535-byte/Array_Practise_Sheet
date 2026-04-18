package ArraysCodingQuestions;

import java.util.Scanner;

public class Count_number_OfElements_greater_than_given_Number34 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Input array size
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the number to compare: ");
            int x = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > x) {
                    count++;
                }
            }
            System.out.println("Number of elements greater than " + x + " = " + count);
        }
}
