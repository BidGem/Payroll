package employee;

import payment.PaymentMethod;

public abstract class EmployeeDecorator implements AbstractEmployee {
    private AbstractEmployee employee;

    public EmployeeDecorator(AbstractEmployee employee) {
        this.employee = employee;
    }

    @Override
    public void sendWage(PaymentMethod paymentMethod) {
        employee.sendWage(paymentMethod);
    }

    @Override
    public double getPrice() {
        return employee.getPrice();
    }

    @Override
    public String getName() {
       return employee.getName();
    }

    @Override
    public String getEmail() {
        return employee.getEmail();
    }
}
