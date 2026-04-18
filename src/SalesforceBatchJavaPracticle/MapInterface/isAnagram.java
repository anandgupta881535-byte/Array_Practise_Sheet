package SalesforceBatchJavaPracticle.MapInterface;

import java.util.HashMap;

public class isAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silten";

        if (str1.length() != str2.length()) {
            System.out.println("No");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("No");
                return;
            }
            map.put(ch, map.get(ch) - 1);
        }
        for (int value : map.values()) {
            if (value != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}