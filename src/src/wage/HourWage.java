package wage;

public class HourWage implements SingleWage {
    private double pricePerHour;
    private int hour;

    //TODO: implementare un metodo per aggoiungere le ore lavorate a fine giornata. Idee: Visitor

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
}
