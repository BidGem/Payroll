package decoratorWage.Reduction;

import decoratorWage.AbstractClasses.DecReduction;
import decoratorWage.Interfaces.AbsWage;

public class ReductionPensione extends DecReduction {
    private final double CONTRIBUTION = 0.1;

    public ReductionPensione(AbsWage currentWage) {
        super(currentWage);
    }

    @Override
    public double get() {
        return super.get() * (1 - CONTRIBUTION);
    }
}
