package ArraysCodingQuestions;
//Replace all Occurances of a specific element with another number.
import java.util.Scanner;

public class Replace_All_Occurences_Of_specificElement6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Number to be Replaced :");
        int num = sc.nextInt();

        for (int i = 0; i<n; i++){
            if(arr[i] == num ){
                System.out.print("Enter another number in place of "+ arr[i]);
                arr[i] = sc.nextInt();
            }

        }
        System.out.println("After Rplacing elment the new Array became  "+ arr);
    }
}
