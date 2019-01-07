package decoratorWage.ConcreteWages;

import decoratorWage.AbstractClasses.DecWage;
import decoratorWage.Interfaces.AbsWage;

public class FixedWage extends DecWage {

    double price;

    public FixedWage(AbsWage absWage, double price) {
        super(absWage);
        this.price = price;
    }

    @Override
    public double get() {
        return super.get() + price;
    }
}
