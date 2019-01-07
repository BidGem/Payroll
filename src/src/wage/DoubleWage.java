package wage;

public class DoubleWage implements Wage {
    private SingleWage first, second;
    @Override
    public double get() {
        return first.get() + second.get();
    }

    @Override
    public void addCommission(double commissionReward) {
        first.addCommission(commissionReward);
        second.addCommission(commissionReward);
    }

    @Override
    public void updateHours(int hours) {
        first.updateHours(hours);
        second.updateHours(hours);
    }


}
