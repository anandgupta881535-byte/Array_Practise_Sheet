package SalesforceBatchJavaPracticle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Mango");
        list1.add("Grapes");
        list1.add("Banana");
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(25);
        list2.add(20);
        list2.add(12);
        list2.add(30);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
//WAP of Arraylist which contains a set of numbers and only the numbers which are divisible by 3 will be removed.