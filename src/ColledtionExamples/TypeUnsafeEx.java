package ColledtionExamples;

import java.util.ArrayList;

public class TypeUnsafeEx {
    public static void main(String[] args) {
        ArrayList number = new ArrayList();//since collection is hetreogenous in nature it can store any type of value (eg: string , boolean, int, double etc)
        number.add(10);
        number.add("Bhopal");
        number.add(2.6);
        int a = (int)number.get(0);//since get take int(index) as argument and return object as its return type, During retriving data Programmer have must to do typeConversion for storing that type of object otherwise get error.
        String b = (String)number.get(1);
        System.out.println(a + " " + b);
    }
}
