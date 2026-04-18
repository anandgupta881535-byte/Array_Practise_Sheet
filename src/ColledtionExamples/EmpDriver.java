package ColledtionExamples;

import java.util.ArrayList;
import java.util.List;

public class EmpDriver {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        Emp e1 = new Emp(45000.0,"Ajay", 23);
        Emp e2 = new Emp(65000.0,"Varun", 26);
        Emp e3 = new Emp(7000.0,"Ravi", 29);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        for(Emp e: empList){
            System.out.println(e);
        }
    }
}
