package test;

import decoratorWage.*;
import employee.AbstractEmployee;
import employee.PensionFund;
import employee.StandardEmployee;
import payment.BankCheck;
import payment.Paypal;


public class Test {

    public static void main(String[] args) {
        StandardEmployee mario = new StandardEmployee("Mario Rossi", "mario.rossi@gmail.com", new FixedWage(new BlankWage(),1700));
        mario.sendWage(new BankCheck(mario));
        mario.sendWage(new Paypal(mario));

        AbstractEmployee luigi = new StandardEmployee("Luigi Bianchi", "luigi.bianchi@hotmail.com",
                new DoubleWage(new CommissionWage(new BlankWage()), new HourWage(new BlankWage(),10)));
        luigi.addCommission(150);
        luigi.updateHours(8);
        luigi.updateHours(5);
        luigi.updateHours(2);
        luigi.setWage(new ReductionPensione(luigi.getWage()));
        //luigi = new PensionFund(luigi);
        luigi.sendWage(new BankCheck(luigi));
        luigi.sendWage(new Paypal(luigi));
    }
}
