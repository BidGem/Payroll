package wage;

public class

CommissionWage implements SingleWage {
    private double amount = 0;

    public void addCommission(double earning) {
        amount += earning;
    }

    @Override
    public double get() {
        double result = amount;
        amount = 0;
        return result;
    }
}
