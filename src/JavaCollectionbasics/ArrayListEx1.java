package JavaCollectionbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

       System.out.println(list.get(3));

       list.add(3,90);
        System.out.println(list);
        System.out.println(list.size());
        list.set(4,80);
        System.out.println(list);
        System.out.println(list.contains(90));
        System.out.println(list.indexOf(90));
        System.out.println(list.remove(3));
    }
}
