package employee;

import payment.PaymentMethod;
import wage.Wage;

public abstract class AbstractEmployee {
    public void sendWage(PaymentMethod paymentMethod) {
        double price = getPrice();
        paymentMethod.pay(price);
    }

    public abstract double getPrice();
    public abstract String getName();
    public abstract String getEmail();
    public abstract void setWage(Wage wage);

    public abstract void addCommission(double commissionReward);
    public abstract void updateHours(int hours);
}
