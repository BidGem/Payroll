package decoratorWage.AbstractClasses;

import decoratorWage.Interfaces.AbsWage;
import decoratorWage.Interfaces.SingleWage;

public abstract class DecWage implements SingleWage {
    private AbsWage absWage;

    public DecWage(AbsWage absWage){
        this.absWage = absWage;
    }

    @Override
    public double get() {
        return absWage.get();
    }

    @Override
    public void addCommission(double commissionReward) {
        absWage.addCommission(commissionReward);
    }

    @Override
    public void updateHours(int hours) {
        absWage.updateHours(hours);
    }
}
