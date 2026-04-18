package SalesforceBatchJavaPracticle;

import java.util.ArrayList;

public class ArraylistEg9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(5);//initially arraylist have a capacity of ten
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
    }
}
