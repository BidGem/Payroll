package paymentscheduler;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Time extends Observable<Scheduler> implements Runnable{
    private static Time instance;

    public static Time getInstance(){
        if (instance == null) {
            instance = new Time();
        }
        return instance;
    }

    private Time() {}

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
}
