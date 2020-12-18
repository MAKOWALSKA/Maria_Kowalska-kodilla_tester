package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void CashMachinesNumberCheck(){

        Bank bank = new Bank(2);
        assertEquals(2, bank.getNumber());
    }

    @Test
    public void CountNumberAllTransactions(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 30);
        bank.addTransaction(0, -50);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 40);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        assertEquals(4, bank.getTotalNumberOfDeposits() + bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void CountTotalBalance(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 100);
        bank.addTransaction(0, 50);
        bank.addTransaction(0, -80);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);

        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);

        assertEquals(270, bank.getTotalBalance());
    }

    @Test
    public void CountTotalDeposits(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        assertEquals(6, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void CountTotalWithdrawals(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        assertEquals(1, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void CalculateAverageAllDeposits(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 40);
        bank.addTransaction(0, 40);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 40);

        bank.addTransaction(1, 40);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 40);
        bank.addTransaction(1, 40);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 40);
        bank.addTransaction(2, 40);
        bank.addTransaction(2, -10);

        assertEquals(40, bank.getTotalAvgDeposits(), 0.01);
    }

    @Test
    public void CalculateAverageAllWithdrawals(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -80);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -80);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -80);

        assertEquals(80, bank.getTotalAverageWithdrawals(), 0.01);
    }
}
