package StringHandlingPracticle;

import java.util.Scanner;



/* write a program  to accept a string from the user and print the first non-repeated character. If there is no non-repeated character, then print not found.*/
public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (char ch: arr) {
            if (str.contains(ch+""));
            else {
                System.out.println("First Non-repeated character is " + ch);
                break;
            }

        }
    }
}
