package loop;

import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = kb.nextInt();
        int rem = ((a/10)/10)%10;

        System.out.println(rem);
    }
}
