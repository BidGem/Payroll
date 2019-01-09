package paymentscheduler;

import employee.AbstractEmployee;
import employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Scheduler implements Observable<AbstractEmployee> {
    List<AbstractEmployee> observers;
    int schedulingDays, currentDay;

    public Scheduler(int days){
        observers = new ArrayList<>();
        schedulingDays = days;
    }

    @Override
    public void add(AbstractEmployee x) {
        observers.add(x);
    }

    @Override
    public void remove(AbstractEmployee x) {
        observers.remove(x);
    }

    @Override
    public void notifyObs() {
        observers.stream().forEach(x->x.sendWage());
    }

    public void update() {
        currentDay++;
        if (currentDay == schedulingDays) {
            currentDay = 0;
            notifyObs();
        }
    }
}
