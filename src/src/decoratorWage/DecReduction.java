package decoratorWage;

public abstract class DecReduction implements AbsWage{

    private AbsWage currentWage;

    public DecReduction(AbsWage currentWage){
        this.currentWage = currentWage;
    }

    @Override
    public double get() {
        return currentWage.get();
    }

    @Override
    public void addCommission(double commissionReward) {
        currentWage.addCommission(commissionReward);
    }

    @Override
    public void updateHours(int hours) {
        currentWage.updateHours(hours);
    }
}
