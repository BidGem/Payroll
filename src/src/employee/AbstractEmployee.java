package employee;

import payment.PaymentMethod;
import wage.Wage;

public interface AbstractEmployee {
    void sendWage(PaymentMethod paymentMethod);

    double getPrice();
    String getName();
    String getEmail();
    void setWage(Wage wage);

    void addCommission(double commissionReward);
    void updateHours(int hours);
}
