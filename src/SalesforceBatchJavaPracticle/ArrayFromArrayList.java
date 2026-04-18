package SalesforceBatchJavaPracticle;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFromArrayList {
    public static void main(String[] args){
        ArrayList<Integer> Arrlis = new ArrayList<>();
        Arrlis.add(32);
        Arrlis.add(67);
        Arrlis.add(98);
        Arrlis.add(100);
        System.out.println("ArrayList:"+Arrlis);
        Object[] arr = Arrlis.toArray();//because since arraylist always contain objects and if we want to convert it to array we need use Object as a datatype.
        System.out.println("Elements of ArrayList as Array:"+ Arrays.toString(arr));
    }
}
