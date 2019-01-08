package payment;

import employee.AbstractEmployee;

public class Paypal implements  PaymentMethod {
    private String email;

    @Override
    public void pay(double price, AbstractEmployee e) {
        System.out.println("Inviato pagamento di " + price + " all'account paypal " + e.getEmail());
        System.out.println();
    }
}
