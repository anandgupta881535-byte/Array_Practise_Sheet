package SalesforceBatchJavaPracticle.LinklistExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//wap of linkedlist with integer element 1,2,3,4,5 and find the middle element
public class ex2 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("List element are: "+ list1);

        int j = list1.size();
        int i = 0;
        int middleElement = i+j/2;
        System.out.println(list1.get(middleElement));
    }
}
//wap to check if linkedlist is palindrome
//test case: 12321  o/u- true