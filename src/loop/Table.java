package loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = sc.nextInt();
        int j = 1;
        System.out.println("Table of"+i);
        while (j<=10){
            System.out.println(i+" * "+j+" = "+(i*j));
            j++;
        }

    }
}
