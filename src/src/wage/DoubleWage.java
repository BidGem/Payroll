package wage;

public class DoubleWage implements Wage {
    private SingleWage first, second;
    @Override
    public double get() {
        return first.get() + second.get();
    }
}
