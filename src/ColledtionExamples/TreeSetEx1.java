package ColledtionExamples;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> numSet = new TreeSet<>();
        numSet.add(10);
        numSet.add(7);
        numSet.add(30);
        numSet.add(23);
        System.out.println( numSet.add(10));
        System.out.println("Total elements added: "+ numSet.size());
        System.out.println(numSet);
    }

}
