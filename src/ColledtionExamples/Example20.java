package ColledtionExamples;

import java.util.HashSet;
import java.util.Set;

public class Example20 {
    public static void main(String[] args) {
        Set<Student> stSet = new HashSet<>();
        Student s1 = new Student("Amit");
        Student s2 = new Student("Sumit");
        Student s3 = new Student("Amit");
        System.out.println("S1's"+ s1.hashcode());
        System.out.println("S2's"+ s2.hashcode());
        System.out.println("S3's" + s3.hashcode());
        stSet.add(s1);
        stSet.add(s2);
        stSet.add(s3);
        System.out.println("size:"+stSet.size());
        System.out.println(stSet);
    }
}
