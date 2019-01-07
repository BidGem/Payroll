package employee;

import payment.PaymentMethod;

public class PensionFund extends EmployeeDecorator {
    private final double CONTRIBUTION = 0.1;

    public PensionFund(AbstractEmployee employee) {
        super(employee);
    }

    @Override
    public double getPrice(){
        double deductedPrice = super.getPrice() * (1 - CONTRIBUTION);
        return deductedPrice;
    }

    @Override
    public void sendWage(PaymentMethod paymentMethod) {
        super.sendWage(paymentMethod);
    }
}
