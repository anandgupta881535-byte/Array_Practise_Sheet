package ExceptionHandling;

import java.util.Scanner;

public class UsePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person("Amit", 21);
        System.out.println(p);
        String city = new String ("Bhopal");
        System.out.println(city);
    }
}
