package SalesforceBatchJavaPracticle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrlistEx6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("abs", "gfh", "hfgf", "ujf" ,"fsjla"));
        System.out.println("Original list: "+names);
        //creating a sublist of above arraylist
        List<String> sub = names.subList(1,4);
        System.out.println("Sub List: "+ sub);

    }
}
