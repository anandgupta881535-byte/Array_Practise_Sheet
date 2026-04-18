package loop;

import java.util.Scanner;

public class Natural_Number {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = kb.nextInt();

        for (int i=a;i>0;i--)
            System.out.print(i+" ");
    }
}
