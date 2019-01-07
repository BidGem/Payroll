package payment;

import employee.AbstractEmployee;

public class Paypal implements  PaymentMethod {
    private String email;

    public Paypal(AbstractEmployee e) {
        email = e.getEmail();
    }
    @Override
    public void pay(double price) {
        System.out.println("Inviato pagamento di " + price + " all'account paypal " + email);
        System.out.println();
    }
}
