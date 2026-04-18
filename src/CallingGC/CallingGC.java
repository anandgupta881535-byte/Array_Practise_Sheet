package CallingGC;


public class CallingGC {
    private String name;
    private int age;
    private double sal;
    private static int count;

    public CallingGC(int age, String nam, double s){
        name = nam;
        age = age;
        sal = s;
        count++;
    }
    public void show(){
        System.out.println("name of Emp is "+name);
        System.out.println("age of Emp is "+age);
        System.out.println("Salary of Emp is "+sal);
    }
    public void showCount(){
        System.out.println("Number of emp in company are:"+count);
    }
    protected void finalize(){
        --count;
    }
}
