package decoratorWage;

public class FixedWage extends DecWage{

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
