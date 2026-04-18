package SalesforceBatchJavaPracticle;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(23);
        list.add(30);
        Collections.reverse(list);
        System.out.println(list);
    }
}
