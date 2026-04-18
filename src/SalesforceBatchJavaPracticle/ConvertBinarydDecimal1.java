package SalesforceBatchJavaPracticle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConvertBinarydDecimal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal number: ");
        int a = sc.nextInt();

        int bitLength = Integer.toBinaryString(a).length();
        int mask = (1<< bitLength) - 1;
        int result = a^mask;
        System.out.println("Output:"+result);

    }
}
