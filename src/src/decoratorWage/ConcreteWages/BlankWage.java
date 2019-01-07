package decoratorWage.ConcreteWages;

import decoratorWage.Interfaces.SingleWage;

public class BlankWage implements SingleWage {

    @Override
    public double get() {
        return 0;
    }

    @Override
    public void addCommission(double commissionReward) {}

    @Override
    public void updateHours(int hours) {}

}

