package employee;

import payment.PaymentMethod;
import paymentscheduler.Observer;
import wage.Wage;

public abstract class AbstractEmployee implements Observer {

    public void update() {
        double price = getPrice();
        getPaymentMethod().pay(price, this);
    }

    public abstract double getPrice();
    public abstract String getName();
    public abstract String getEmail();
    public abstract String getCardNumber();
    public abstract void setWage(Wage wage);
    public abstract void setPaymentMethod(PaymentMethod method);
    public abstract PaymentMethod getPaymentMethod();

    public abstract void addCommission(double commissionReward);
    public abstract void updateHours(int hours);
}
