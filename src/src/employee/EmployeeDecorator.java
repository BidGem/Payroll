package employee;

import payment.PaymentMethod;
import wage.Wage;

public abstract class EmployeeDecorator extends AbstractEmployee {
    private AbstractEmployee employee;

    public EmployeeDecorator(AbstractEmployee employee) {
        this.employee = employee;
    }

    @Override
    public double getPrice() {
        return employee.getPrice();
    }

    @Override
    public String getName() {
       return employee.getName();
    }

    @Override
    public String getEmail() {
        return employee.getEmail();
    }

    @Override
    public void addCommission(double commissionReward) {
        employee.addCommission(commissionReward);
    }

    @Override
    public void updateHours(int hours) {
        employee.updateHours(hours);
    }

    @Override
    public void setWage(Wage wage) {
        employee.setWage(wage);
    }
}
