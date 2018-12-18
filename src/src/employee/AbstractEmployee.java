package employee;

import payment.PaymentMethod;

public interface AbstractEmployee {
    void sendWage(PaymentMethod paymentMethod);

    double getPrice();
    String getName();
}
