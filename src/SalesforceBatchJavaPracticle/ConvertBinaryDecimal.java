package SalesforceBatchJavaPracticle;

import java.util.Scanner;
import java.util.*;
public class ConvertBinaryDecimal {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Input decimal number
            System.out.print("Enter a decimal number: ");
            int decimal = sc.nextInt();

            List<Integer> binaryList = new ArrayList<>();
            int temp = decimal;
            while (temp > 0) {
                binaryList.add(temp % 2);
                temp /= 2;
            }
            Collections.reverse(binaryList); // Correct order

            System.out.println("Binary representation: " + binaryList);


            List<Integer> toggledList = new ArrayList<>();
            for (int bit : binaryList) {
                toggledList.add(bit == 0 ? 1 : 0);
            }
            System.out.println("Toggled bits: " + toggledList);


            int toggledDecimal = 0;
            int power = 0;
            for (int i = toggledList.size() - 1; i >= 0; i--) {
                toggledDecimal += toggledList.get(i) * Math.pow(2, power);
                power++;
            }

            System.out.println("Decimal after toggling: " + toggledDecimal);



    }
}
