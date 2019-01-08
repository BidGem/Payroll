package test;

import employee.*;
import payment.BankCheck;
import payment.CreditCard;
import payment.Paypal;
import wage.CommissionWage;
import wage.DoubleWage;
import wage.FixedWage;
import wage.HourWage;

public class Test {

    public static void main(String[] args) {
        BankCheck bank = new BankCheck();
        CreditCard creditCard = new CreditCard();
        Paypal paypal = new Paypal();
        Employee mario = new Employee(new EmployeeContacts("mario@email.com", "Mario Rossi", "1234-5678-9012-3232"),
                new FixedWage(1700));
        mario.sendWage(bank);
        mario.sendWage(paypal);

        AbstractEmployee luigi = new Employee(new EmployeeContacts("luigi@email.com", "Luigi Verdi", "0000-5678-1111-3232"),
                new DoubleWage(new CommissionWage(), new HourWage(10)));
        luigi.addCommission(150);
        luigi.updateHours(8);
        luigi.updateHours(5);
        luigi.updateHours(2);
        luigi = new PensionFund(luigi);

        luigi.sendWage(bank);
        luigi.sendWage(paypal);
        luigi.sendWage(creditCard);//TODO genera errore, rende tutto nullo


        AbstractEmployee antonio = new Manager(new EmployeeContacts("antonio@email.com", "Antonio Blu", "7777-5678-0000-3232"),
                new FixedWage(1000));
        antonio.sendWage(creditCard);
        antonio = new PensionFund(antonio);
        antonio.sendWage(bank);
        antonio.sendWage(paypal);
        antonio.sendWage(creditCard);//TODO genera errore, rende tutto nullo
    }
}
