package SalesforceBatchJavaPracticle.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(101, "Amit");
        students.put(102, "Ravi");
        students.put(103, "Neha");
        students.put(104, "Priya");
        System.out.println("Initial HashMap: "+students);
        System.out.println("\nGet student with roll 102: "+ students.get(102));
        System.out.println("Contains key 103? "+ students.containsKey(103));
        System.out.println("Contains value 'Neha'?"+ students.containsValue("Neha"));
        //entrySet()
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        System.out.println("Students list is empty: "+ students.isEmpty());
        System.out.println("\nHashMap hashCode: "+ students.hashCode());
        HashMap<Integer,String> students2 = new HashMap<>();
        students2.put(101, "Amit");
        students2.put(102, "Ravi");
        students2.put(103, "Neha");
        students2.put(104, "Priya");
        System.out.println("\n students equals students2?"+ students.equals(students2));
        students.clear();
        System.out.println("\nAfter clear(), students: "+ students);
        System.out.println("Is hashMap empty now?" + students.isEmpty());

    }
}
