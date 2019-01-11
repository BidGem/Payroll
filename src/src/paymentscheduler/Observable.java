package paymentscheduler;

import employee.Employee;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T extends Observer> {
    private List<T> obs = new ArrayList<>();

    public void add(T x) {
        obs.add(x);
    };

    public void remove(T x) {
        obs.remove(x);
    };

    public void notifyObs() {
        obs.stream().forEach(x -> x.update());
    };
}
