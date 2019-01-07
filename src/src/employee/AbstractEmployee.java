package employee;

import decoratorWage.Interfaces.AbsWage;
import payment.PaymentMethod;

public interface AbstractEmployee {
    void sendWage(PaymentMethod paymentMethod);

    double getPrice();
    String getName();
    String getEmail();
    void setWage(AbsWage wage);
    AbsWage getWage();

    void addCommission(double commissionReward);
    void updateHours(int hours);
}
