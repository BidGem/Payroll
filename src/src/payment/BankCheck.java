package payment;

public class BankCheck implements PaymentMethod {
    private static int id = 0;

    @Override
    public void pay(double price) {
        System.out.println("A vista pagate per questo assegno bancario n. " + id);
        System.out.println("euro" + price);
        id++;
    }
}
