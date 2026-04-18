package SalesforceBatchJavaPracticle.LinklistExamples;

import java.util.*;

//create a program to manage student enrollments using LinkedList.
public class LinklistEx1 {
    public static void main(String[] args) {
        List<String>  list1 = new LinkedList<String>();
        list1.add("Amit");
        list1.add("Sneha");
        list1.add("Rahul");
        list1.addFirst("Priya");
        list1.addLast("karan");
        System.out.println("List of the student are: "+list1);
        List<String>  list2 = new LinkedList<String>();
        list2.addAll(list1);
        System.out.println("List of the student are: "+list2);

        System.out.println("Reversing the linkedlist: ");
        Iterator<String> iterator = ((LinkedList<String>) list1).descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Iterating through listIterator: ");
        ListIterator<String> itr = list1.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
