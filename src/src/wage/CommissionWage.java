package wage;

public class CommissionWage implements SingleWage {
    private double amount = 0;

    @Override
    public double get() {
        double result = amount;
        amount = 0;
        return result;
    }

    @Override
    public void addCommission(double commissionReward) {
        amount += commissionReward;
    }

    @Override
    public void updateHours(int hours) {

    }
}
