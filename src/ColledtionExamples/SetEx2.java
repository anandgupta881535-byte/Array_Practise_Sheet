package ColledtionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        System.out.println("Adding 10:"+numSet.add(10));
        System.out.println("adding 20:"+ numSet.add(20));
        System.out.println("adding 30:"+ numSet.add(30));
        System.out.println("adding 50:"+ numSet.add(50));
        System.out.println("adding 30 again:"+ numSet.add(30));
        Iterator<Integer> it= numSet.iterator();
        while(it.hasNext()){//hasNext() return true if their further element exist otherwise false.
            int x = it.next();
            System.out.println(x);
        }
    }
}
