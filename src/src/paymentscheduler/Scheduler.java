package paymentscheduler;

import employee.AbstractEmployee;
import employee.Employee;

import java.util.ArrayList;
import java.util.List;

public abstract class Scheduler extends Observable<AbstractEmployee> implements Observer {

    public Scheduler(){
        super();
        Time.getInstance().add(this);
    }
}
