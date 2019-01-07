package decoratorWage.ConcreteWages;

import decoratorWage.AbstractClasses.DecDoubleWage;
import decoratorWage.Interfaces.SingleWage;

public class DoubleWage extends DecDoubleWage {


    public DoubleWage(SingleWage first, SingleWage second) {
        super(first, second);
    }
}
