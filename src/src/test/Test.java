package test;

import employee.AbstractEmployee;
import employee.Employee;
import employee.PensionFund;
import payment.BankCheck;
import payment.Paypal;
import wage.CommissionWage;
import wage.DoubleWage;
import wage.FixedWage;
import wage.HourWage;

public class Test {

    public static void main(String[] args) {
        Employee mario = new Employee("Mario Rossi", "mario.rossi@gmail.com", new FixedWage(1700));
        mario.sendWage(new BankCheck());
        mario.sendWage(new Paypal());

        AbstractEmployee luigi = new Employee("Luigi Bianchi", "luigi.bianchi@hotmail.com",
                new DoubleWage(new CommissionWage(), new HourWage(10)));
        luigi.addCommission(150);
        luigi.updateHours(8);
        luigi.updateHours(5);
        luigi.updateHours(2);
        luigi = new PensionFund(luigi);
        luigi.sendWage(new BankCheck());
        luigi.sendWage(new Paypal());
    }
}
