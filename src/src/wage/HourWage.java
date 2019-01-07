package wage;

public class HourWage implements SingleWage {
    private double pricePerHour;
    private int hour;

    public HourWage(double priceForHour) {
        this.pricePerHour = priceForHour;
        hour = 0;
    }

    @Override
    public double get() {
        double price = hour * pricePerHour;
        hour = 0;
        return price;
    }

    @Override
    public void addCommission(double commissionReward) {

    }

    @Override
    public void updateHours(int hours) {
        addHour(hours);
    }

    private void addHour(int h){
        hour += h;
    }

}
