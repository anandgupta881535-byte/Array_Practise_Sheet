package SalesforceBatchJavaPracticle;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections.*;

//create an arraylist<String> of courses. Add couses using add() and addAll(), Remove dropped courses using remove()
// and removeIf() check if mandatory courses are registered using containsALl();
public class CourseRegistrationSys {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Discret Mathematic");
        list.add("DBMS");
        list.add("COA");
        list.add("DSA");
        list.remove(3);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("DBMS");
        list2.add("COA");
        System.out.println(list.containsAll(list2));
    }
}
