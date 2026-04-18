package SalesforceBatchJavaPracticle;

import java.util.ArrayList;

public class MaxNOArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new  ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(23);
        list.add(30);
        System.out.println(largestEle(list));
    }
    public static int largestEle(ArrayList<Integer> list){
        int a = list.get(0);
        for(int i =0; i<list.size();i++){
            if (a<list.get(i)){
                a = list.get(i);
            }
        }
        return a;
    }
}
