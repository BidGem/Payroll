package payment;

import employee.AbstractEmployee;
import employee.Employee;

public class BankCheck implements PaymentMethod {
    private static int id = 0;

    @Override
    public void pay(double price, AbstractEmployee e) {
        System.out.println("A vista pagate per questo assegno bancario n. " + id);
        System.out.println("euro " + price);
        System.out.println("a " +  e.getName());
        System.out.println();
        id++;
    }
}
