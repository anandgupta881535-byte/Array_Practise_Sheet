package InheritanceExample;

public class UseManager {
    public static void main(String[] args) {
        Manager boss;
        boss = new Manager();
        boss.setEmp("Anand", 800000);
        boss.setBonous(3000000);
        System.out.println("Boss name:"+boss.getName());
        System.out.println("Total income:"+ boss.getTotalIncome());
    }
}
