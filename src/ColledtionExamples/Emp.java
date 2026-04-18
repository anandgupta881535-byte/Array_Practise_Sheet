package ColledtionExamples;

class Emp{
        private int age;
        private String name;
        private double salary;

    public Emp(double salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return"[age="+age+",name="+name+",salary="+salary+"]";
    }
}

