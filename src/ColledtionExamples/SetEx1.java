package ColledtionExamples;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<Integer> numList = new HashSet<>();
        System.out.println("adding 10:"+ numList.add(10));//add return true or false
        System.out.println("adding 20:"+ numList.add(20));
        System.out.println("adding 30:"+ numList.add(30));
        System.out.println("adding 50:"+ numList.add(50));
        System.out.println("adding 30 again:"+ numList.add(30));
        for (int x : numList){
            System.out.println(x);
        }
        System.out.println(numList);
    }
}
