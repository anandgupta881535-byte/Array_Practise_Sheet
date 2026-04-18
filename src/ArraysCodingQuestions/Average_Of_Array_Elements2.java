package ArraysCodingQuestions;

import java.util.Scanner;

public class Average_Of_Array_Elements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int sum =0;
        double avg = 0;
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        avg = (double)sum/n;
        System.out.println(avg);
    }
}
