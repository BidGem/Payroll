package employee;

import payment.PaymentMethod;
import wage.Wage;

public abstract class AbstractEmployee {

    EmployeeContacts contacts;
    Wage currentWage;

    public void sendWage(PaymentMethod paymentMethod) {
        double price = getPrice();
        paymentMethod.pay(price, this);
    }


    public abstract double getPrice();

    public String getName() {
        return contacts.getName();
    }

    public String getEmail() {
        return contacts.getEmail();
    }

    public String getCardNumber(){
        return contacts.getCard_number();
    }

    public void setWage(Wage wage) {
        currentWage = wage;
    }

    public void addCommission(double commissionReward) {
        currentWage.addCommission(commissionReward);
    }

    public void updateHours(int hours) {
        currentWage.updateHours(hours);
    }
}
