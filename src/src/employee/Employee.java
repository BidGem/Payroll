package employee;
import payment.PaymentMethod;
import wage.Wage;

public class Employee implements AbstractEmployee{
    private String name;
    private Wage wage;

    public Employee (String name, Wage wage) {
        this.name = name;
        this. wage = wage;
    }

    @Override
    public void sendWage(PaymentMethod paymentMethod){
        double price = getPrice();
        paymentMethod.pay(price);
    };

    @Override
    public double getPrice() {
        return wage.get();
    }

    @Override
    public String getName() {
        return name;
    }
}
