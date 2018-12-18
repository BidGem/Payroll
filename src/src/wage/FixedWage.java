package wage;

public class FixedWage implements SingleWage {
    private double salary;

    public FixedWage (double salary) {
        this.salary = salary;
    }
    @Override
    public double get() {
        return salary;
    }
}
