package SalesforceBatchJavaPracticle;

import java.util.ArrayList;

public class RemoveAllEvenNo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(23);
        list.add(30);
        list.removeIf(n -> (n%2 == 0));
        System.out.println(list);
    }

}
