package payment;

import employee.AbstractEmployee;
import employee.Employee;

public interface PaymentMethod {
    void pay(double price, AbstractEmployee e);
}
