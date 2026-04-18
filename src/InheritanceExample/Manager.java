package InheritanceExample;

public class Manager extends Emp{
    private double bonous;
    public void setBonous(double bonous){
        this.bonous = bonous;
    }

    public double getTotalIncome(){
        double total;
        total = getSal() + bonous;
        return total;
    }


}
