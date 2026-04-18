package SalesforceBatchJavaPracticle.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//wap for changing the element in hashmap
//1. java  2.is  3.Dynamic
//you need to change dynamic with platform independent
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(2,"is");
        map.put(3,"Dynamic");
        //map.put(3, "Platform Independent");
        for(Map.Entry m: map.entrySet()){
            if("Dynamic".equals(m.getValue())){
                m.setValue("Platform Independent");
            }
            System.out.println(m.getKey()+ " "+ m.getValue());
        }

    }
}
