package SalesforceBatchJavaPracticle;

import java.util.ArrayList;

public class AcceptinHetrogeneousData {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<Object>();//hold Heterogeneous kind of datatypes
        arr.add("Java is a Platform");
        arr.add(14);
        arr.add(1800L);
        arr.add(6.0D);
        arr.add(1.99F);
        System.out.println("ArrayList after all insertions: ");
        display(arr);
        arr.set(0,50);
        arr.set(1, 10.0D);
        System.out.println("ArrayList after modifications: ");
        display(arr);
    }
    public static void display(ArrayList<Object> arr){
        for(int i =0; i<arr.size(); i++){//we use size method for arraylist
            System.out.println(arr.get(i)+" ");
        }
        System.out.println();
    }
}
