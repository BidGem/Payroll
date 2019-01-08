package payment;

import employee.AbstractEmployee;
import employee.Employee;

public abstract class PaymentMethod {

    private static int idPayment = 0;

    public void pay(double price, AbstractEmployee e) {
        System.out.println(e.getName());
        printHeader();
        printPayRecepit(price, e);
        idPayment++;
        System.out.println();
        System.out.println();
    }

    private void printHeader(){
        System.out.println("Pagamento #"+ idPayment + " effettuato");
        System.out.println("Dettagli del Pagamento:");
    }

    abstract void printPayRecepit(double price, AbstractEmployee e);

}
