package paymentscheduler;

import java.util.ArrayList;
import java.util.List;

public class Time extends Thread implements Observable<Scheduler>{
    List<Scheduler> observers = new ArrayList<>();

    @Override
    public void run() {

        try {
         while(true) {
             notifyObs();
             sleep(300);
         }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Scheduler x) {
        observers.add(x);
    }

    @Override
    public void remove(Scheduler x) {
        observers.remove(x);
    }

    @Override
    public void notifyObs() {
        observers.stream().forEach(x -> x.update());
    }
}
