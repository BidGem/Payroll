package employee;
import wage.Wage;

public class Employee extends AbstractEmployee{

    public Employee (EmployeeContacts contacts, Wage wage) {
        this.currentWage = wage;
        this.contacts = contacts;
    }

    @Override
    public double getPrice() {
        return currentWage.get();
    }



}
