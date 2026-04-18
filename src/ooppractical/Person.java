package ooppractical;

public class Person {

    private String name;
    private int age;

    public Person(String n, int a){
        name = n;
        age = a;
    }

    public void show(){
        System.out.println("name of person is:"+name);
        System.out.println("age of person is:"+age);
    }

}
