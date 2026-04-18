package oopexamples;

public class Student {
    int roll;
    char grade;
    double perc;

    public Student(int roll, char grade, double perc){
        this.roll = roll;
        this.grade = grade;
        this.perc = perc;
    }

    public void show(){
        System.out.println("Roll of student: "+roll);
        System.out.println("Grade of student: "+grade);
        System.out.println("Percentage of student: "+perc);
    }
}
