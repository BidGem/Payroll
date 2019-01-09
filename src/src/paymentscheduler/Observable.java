package paymentscheduler;

import employee.Employee;

public interface Observable<T> {
    void add(T x);
    void remove(T x);
    void notifyObs();
}
