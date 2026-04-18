package loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from where to start:");
        int i = sc.nextInt();
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }
}
