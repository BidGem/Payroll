package employee;

import payment.PaymentMethod;

public interface AbstractEmployee {
    void sendWage(PaymentMethod paymentMethod);

    double getPrice();
    String getName();
    String getEmail();

    void addCommission(double commissionReward);
    void updateHours(int hours);
}
