package session10.Xuatsac1;

public class Manager extends Employee implements BonusCalculator{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getBonus() {
        return 37;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+ getBonus();
    }
}
