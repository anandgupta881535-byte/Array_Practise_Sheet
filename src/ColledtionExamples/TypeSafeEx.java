package ColledtionExamples;

import java.util.ArrayList;

public class TypeSafeEx {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();//using <Integer> is good while retriving the data, no need to typecoonversion.
        numList.add(10);
        numList.add(20);
        numList.add(30);
        for(int x: numList) {

            System.out.println(x);
        }
        for(int i=0;i<numList.size() ; i++){
            int a = numList.get(i);// no need typeConversion;
            System.out.println(a);
        }
    }
}
