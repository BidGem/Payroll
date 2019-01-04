package employee;
import payment.PaymentMethod;
import wage.Wage;

public class Employee implements AbstractEmployee{
    private String name;
    private Wage wage;
    private String email;

    public Employee (String name, String email, Wage wage) {
        this.name = name;
        this. wage = wage;
        this.email = email;
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

    @Override
    public String getEmail() {
        return email;
    }
}
