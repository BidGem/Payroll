package wage;

public class HourWage implements SingleWage {
    private double pricePerHour;
    private int hours;

    public HourWage(double priceForHour) {
        this.pricePerHour = priceForHour;
        hours = 0;
    }

    @Override
    public double get() {
        double price = hours * pricePerHour;
        hours = 0;
        return price;
    }

    @Override
    public void addCommission(double commissionReward) {

    }

    @Override
    public void updateHours(int hours) {
        addHours(hours);
    }

    private void addHours(int h){
        hours += h;
    }

}
