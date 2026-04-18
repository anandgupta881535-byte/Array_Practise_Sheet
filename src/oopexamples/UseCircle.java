package oopexamples;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Circle obj = new Circle();
        int rad;
        System.out.println("Enter radius:");
        rad = kb.nextInt();
        obj.setRadius(rad);
        obj.calArea();
        obj.calCircumference();

    }
}
