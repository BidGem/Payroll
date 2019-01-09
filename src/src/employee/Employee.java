package employee;
import payment.PaymentMethod;
import wage.Wage;

public class Employee extends AbstractEmployee{
    private Wage currentWage;
    private PaymentMethod paymentMethod;
    private EmployeeContacts contacts;

    public Employee (EmployeeContacts contacts, Wage wage, PaymentMethod method) {
        this.currentWage = wage;
        this.contacts = contacts;
        this.paymentMethod = method;
    }

    public Employee (String name, String email, String cardNum, Wage wage, PaymentMethod method) {
        this.currentWage = wage;
        this.contacts = new EmployeeContacts(email, name, cardNum);
        this.paymentMethod = method;
    }

    @Override
    public double getPrice() {
        return currentWage.get();
    }

    @Override
    public String getName() {
        return contacts.getName();
    }

    @Override
    public String getEmail() {
        return contacts.getEmail();
    }

    @Override
    public String getCardNumber() {
        return contacts.getCardNumber();
    }

    @Override
    public void setWage(Wage wage) {
        currentWage = wage;
    }

    @Override
    public void setPaymentMethod(PaymentMethod method) {
        paymentMethod = method;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }



    @Override
    public void addCommission(double commissionReward) {
        currentWage.addCommission(commissionReward);
    }

    @Override
    public void updateHours(int hours) {
        currentWage.updateHours(hours);
    }


}
