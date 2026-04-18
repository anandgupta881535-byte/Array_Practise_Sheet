package loop;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
