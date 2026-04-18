package SalesforceBatchJavaPracticle.MapInterface;

import java.util.HashMap;

public class wordFrequency {
    public static void main(String[] args) {
        String str = "Java is easy, Java is powerfull";
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: str.split(" ")){
            map.put(s , map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
    }
}
//First non-repeating character by using hashmap
//String = "Swiss";

