package employee;

import decoratorWage.Interfaces.AbsWage;
import payment.PaymentMethod;

public class Employee implements AbstractEmployee{
    private String name;
    private AbsWage wage;
    private String email;

    public Employee(String name, String email, AbsWage wage){
        this.name = name;
        this. wage = wage;
        this.email = email;
    }

    @Override
    public void sendWage(PaymentMethod paymentMethod) {
        double price = getPrice();
        paymentMethod.pay(price);
    }

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

    @Override
    public void setWage(AbsWage wage) {
        this.wage = wage;
    }

    @Override
    public AbsWage getWage() {
        return wage;
    }

    @Override
    public void addCommission(double commissionReward) {
        wage.addCommission(commissionReward);
    }

    @Override
    public void updateHours(int hours) {
        wage.updateHours(hours);
    }
}
