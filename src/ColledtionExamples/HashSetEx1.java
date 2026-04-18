package ColledtionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();//loose coupling
        System.out.println("Adding 10:"+ numSet.add(10));
        System.out.println("Adding 20:"+ numSet.add(20));
        System.out.println("Adding 30:"+ numSet.add(30));
        System.out.println("Adding 40:"+ numSet.add(40));
        System.out.println("Adding 50:"+ numSet.add(50));
        System.out.println("Adding 30 again:"+numSet.add(30));
        Iterator<Integer> it = numSet.iterator();//java says it is best to use Iterator(I) when you have do Traverse + manupulation(eg: add(), remove() etc) in your collection
        while(it.hasNext()){//boolean hasNext() method work just like condition(i<=10) in for loop "agar agla elment exist kar rha hoga toh ye true degi otherwise false"
            int x = it.next();// Object next() it is just like (i++) in loop return the data or element to which it is pointing.
            System.out.println(x);
        }
        System.out.println(numSet);
    }
}
