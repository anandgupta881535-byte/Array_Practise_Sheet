package SalesforceBatchJavaPracticle;

import java.util.ArrayList;

//wap of removeIf() on arraylist which contain set of student name starting with 's' will remove
public class ArrlistEx8 {
    public static void main(String[] args) {
        ArrayList<String> numlist = new ArrayList<String>();
        numlist.add("abhishek");
        numlist.add("shubham");
        numlist.removeIf(n -> (n.charAt(0) == 's'));
        for (String str: numlist){
            System.out.println(str);
        }
    }
}
