package ArraysCodingQuestions;

import java.util.Scanner;

public class Find_the_majority_element37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int candidate = findCandidate(arr);
        if (isMajority(arr, candidate)) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }
    }

    // Step 1: Find candidate using Boyer-Moore
    private static int findCandidate(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }

    // Step 2: Verify candidate
    private static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}
