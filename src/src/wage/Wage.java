package wage;

public interface Wage {
    double get();

    void addCommission(double commissionReward);
    void updateHours(int hours);
}
