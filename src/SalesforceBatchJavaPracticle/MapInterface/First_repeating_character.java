package SalesforceBatchJavaPracticle.MapInterface;

import java.util.HashMap;

//First non-repeating character by using hashmap
//String = "Swiss";
public class First_repeating_character {
    public static void main(String[] args) {
        String str = "swiss";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) != 1) {
                System.out.println("First repeating character: " + ch);
                return;
            }
        }
        System.out.println("No repeating character found");
    }
}
//wap to check anagram when string one equal to listen
//string2 = silent

