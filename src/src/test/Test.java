package test;

import employee.*;
import payment.BankCheck;
import payment.CreditCard;
import payment.Paypal;
import paymentscheduler.Scheduler;
import paymentscheduler.Time;
import wage.CommissionWage;
import wage.DoubleWage;
import wage.FixedWage;
import wage.HourWage;

public class Test {

    public static void main(String[] args) {
        Time t = new Time();

        AbstractEmployee mario = new Employee(
                new EmployeeContacts("mario.rossi@hotmail.com", "Mario Rossi", "0000-1111-2222-3333"),
                new DoubleWage(new FixedWage(1000), new CommissionWage()),
                new BankCheck());
        mario.addCommission(400);

        AbstractEmployee luigi = new Employee(
                new EmployeeContacts("luigi.rossi@hotmail.com", "Luigi Bianchi", "0000-1111-2222-3333"),
                new DoubleWage(new FixedWage(800), new CommissionWage()),
                new Paypal());
        luigi = new PensionFund(luigi);

        Scheduler weekly = new Scheduler(7);
        Scheduler monthly = new Scheduler( 30);
        weekly.add(mario);
        monthly.add(luigi);

        t.add(monthly);
        t.add(weekly);
        t.start();
    }
}
