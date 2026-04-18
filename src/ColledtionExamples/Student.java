package ColledtionExamples;

import java.util.Objects;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }


    @Override
    public boolean equals(Object o){
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Student student = (Student)o;
        return Objects.equals(name, student.name);
    }


    public int hashcode() {
        return Objects.hashCode(name);
    }
}
