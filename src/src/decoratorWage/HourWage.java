package decoratorWage;

public class HourWage extends DecWage{
    private double pricePerHour;
    private int hour;

    public HourWage(AbsWage absWage, double pricePerHour) {
        super(absWage);
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double get() {
        double price = super.get() + hour * pricePerHour;
        hour = 0;
        return price;
    }

    @Override
    public void updateHours(int hours) {
        super.updateHours(hours);//????
        hour += hours;
    }
}
