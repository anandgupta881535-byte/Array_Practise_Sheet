package StringHandlingPracticle;

import java.util.Scanner;


 class MyStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String is: " + s + " and its length is " + s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);/* Once a String object is created, its contents cannot be changed.
        - Any operation that seems to "modify" a string (like toUpperCase(), trim(), replace()) actually returns a new String object, leaving the original untouched.*/

    }
}

