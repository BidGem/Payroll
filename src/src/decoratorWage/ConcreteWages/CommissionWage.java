package decoratorWage.ConcreteWages;

import decoratorWage.AbstractClasses.DecWage;
import decoratorWage.Interfaces.AbsWage;

public class CommissionWage extends DecWage {
    private double amount;

    public CommissionWage(AbsWage absWage) {
        super(absWage);
    }

    @Override
    public double get() {
        double result = amount;
        amount = 0;
        return result;
    }

    @Override
    public void addCommission(double commissionReward) {
        super.addCommission(commissionReward);
        amount += commissionReward;
    }
}
