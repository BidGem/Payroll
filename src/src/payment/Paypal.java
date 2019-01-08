package payment;

import employee.AbstractEmployee;

public class Paypal extends PaymentMethod {

    @Override
    void printPayRecepit(double price, AbstractEmployee e) {
        System.out.println("Inviato pagamento di " + price + " all'account paypal " + e.getEmail());
    }
}
