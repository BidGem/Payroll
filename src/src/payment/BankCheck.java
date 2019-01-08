package payment;

import employee.AbstractEmployee;
import employee.Employee;

public class BankCheck extends PaymentMethod {

    private static int checkId = 0;

    @Override
    void printPayRecepit(double price, AbstractEmployee e) {
        System.out.println("A vista pagate per questo assegno bancario n. " + checkId);
        System.out.print(" euro " + price);
        System.out.print(" a " +  e.getName());
        checkId++;
    }

}
