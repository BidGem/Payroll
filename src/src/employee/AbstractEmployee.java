package employee;

import decoratorWage.AbsWage;
import payment.PaymentMethod;
import wage.Wage;

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
