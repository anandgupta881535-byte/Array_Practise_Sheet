package SalesforceBatchJavaPracticle;

import java.util.ArrayList;

//WAP of Arraylist which contains a set of numbers and only the numbers which are divisible by 3 will be removed.

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(12);
        arr.add(9);
        arr.add(6);
        System.out.println("Numbers are: "+arr);

            arr.removeIf(n->n % 3 ==0);
        System.out.println("After removing element divisible by 3:"+arr);
    }
}
