package paymentscheduler;

public class PeriodicScheduler extends Scheduler {
    private int schedulingDays, currentDay;

    public PeriodicScheduler(int days){
        super();
        schedulingDays = days;
    }

    @Override
    public void update() {
        currentDay++;
        if (currentDay == schedulingDays) {
            currentDay = 0;
            notifyObs();
        }
    }
}
