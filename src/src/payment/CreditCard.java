package payment;

import employee.AbstractEmployee;

public class CreditCard extends PaymentMethod {

    @Override
    void printPayRecepit(double price, AbstractEmployee e) {
        System.out.println("Pagamento di " + price +" Euro inviato alla carta numero " + e.getCardNumber());
    }
}
