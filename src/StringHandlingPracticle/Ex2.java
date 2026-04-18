package StringHandlingPracticle;

import java.util.Scanner;

public class Ex2 {
    public static void main(String [] args){
    Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = kb.nextLine();
        StringBuffer sb = new StringBuffer(str);

        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){//since equals() is not present in stringBUffer.
            System.out.println("It is palindrome string");
        }else{
            System.out.println("It is not a palindrome string");
        }
    }
}
