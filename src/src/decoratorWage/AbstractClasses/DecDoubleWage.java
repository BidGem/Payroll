package decoratorWage.AbstractClasses;

import decoratorWage.Interfaces.AbsWage;
import decoratorWage.Interfaces.SingleWage;

public abstract class DecDoubleWage implements AbsWage {
    private SingleWage first, second;

    public DecDoubleWage(SingleWage first, SingleWage second){
        this.first = first;
        this.second = second;
    }

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
