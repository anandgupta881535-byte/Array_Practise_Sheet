package ArraysCodingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rearrange_array_so_that_positive_andNegative_numbers_alternate36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Element: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of an array: ");
        int []arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(arr[i] >= 0){
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }

        // Merge alternately
        int posIndex = 0, negIndex = 0;
        int[] result = new int[n];
        int k = 0;

        // Alternate until one list runs out
        while (posIndex < positive.size() && negIndex < negative.size()) {
            result[k++] = positive.get(posIndex++);
            result[k++] = negative.get(negIndex++);
        }

        // Add remaining positives
        while (posIndex < positive.size()) {
            result[k++] = positive.get(posIndex++);
        }

        // Add remaining negatives
        while (negIndex < negative.size()) {
            result[k++] = negative.get(negIndex++);
        }

        System.out.println("Rearranged array: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
