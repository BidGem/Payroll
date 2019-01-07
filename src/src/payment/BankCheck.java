package payment;

import employee.AbstractEmployee;

public class BankCheck implements PaymentMethod {
    private static int id = 0;
    private String name;

    public BankCheck(AbstractEmployee e){
        name = e.getName(); //TODO check
    }

    @Override
    public void pay(double price) {
        System.out.println("A vista pagate per questo assegno bancario n. " + id);
        System.out.println("euro " + price);
        System.out.println("a " +  name);
        System.out.println();
        id++;
    }
}
