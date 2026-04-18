package SalesforceBatchJavaPracticle;

import java.util.ArrayList;
//WAP and add a few element inside an Arraylist like mango, apple, banana, grapes, and traversing those element using for each rule
public class TraversingArrayForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        for(String str: list){
            System.out.println(str);
        }
    }
}
