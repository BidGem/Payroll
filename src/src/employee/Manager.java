package employee;

import wage.Wage;

public class Manager extends AbstractEmployee {

    public Manager(EmployeeContacts contacts, Wage currentWage) {
        this.currentWage = currentWage;
        this.contacts = contacts;
    }

    @Override
    public double getPrice() {
        return currentWage.get() * 1.5;
    }
}
