package com.kodilla.bank.homework.tests;

import com.kodilla.bank.homework.CashMachine;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CashMachineTestSuite {

        @Test
        public void arrayShouldHaveZeroLength() {
            CashMachine cashMachine = new CashMachine();
            int[] transactions = cashMachine.getTransactions();
            assertEquals(0, transactions.length);
        }

        @Test
        public void CountNumberOfTransactions(){
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(50);
            cashMachine.addTransaction(-100);
            cashMachine.addTransaction(-20);
            cashMachine.addTransaction(10);
            assertEquals(3, cashMachine.getTransactions().length);
        }

        @Test
        public void CalculateBalance(){
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(10);
            cashMachine.addTransaction(20);
            cashMachine.addTransaction(30);
            cashMachine.addTransaction(-40);
            cashMachine.addTransaction(10);
            assertEquals(30, cashMachine.getBalance());
        }

        @Test
        public void ReturnZeroBalance(){
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(100);
            cashMachine.addTransaction(20);
            cashMachine.addTransaction(-20);
            cashMachine.addTransaction(-100);
            assertEquals(0, cashMachine.getBalance());
        }

        @Test
        public void ReturnZeroBalanceWithNoTransactionsMade(){
            CashMachine cashMachine = new CashMachine();
            assertEquals(0, cashMachine.getBalance());
        }

        @Test
        public void ReturnAverageZeroWhenNoTransactionsMade(){
            CashMachine cashMachine = new CashMachine();
            assertEquals(0.0, cashMachine.getAverageDeposit() + cashMachine.getAverageWithdrawals(), 0.01);
        }

        @Test
        public void DontCountWithdrawTransactionIfCashMachineEmpty(){
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(-40);
            cashMachine.addTransaction(-10);
            cashMachine.addTransaction(-5);
            assertEquals(0,cashMachine.getNumberOfWithdrawals());
        }

        @Test
        public void DontCountWithdrawTransactionWhenNotEnoughFunds(){
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(200);
            cashMachine.addTransaction(-100);
            cashMachine.addTransaction(200);
            cashMachine.addTransaction(-300);
            cashMachine.addTransaction(-300);
            assertEquals(2,cashMachine.getNumberOfWithdrawals());
        }

        @Test
        public void ReturnZeroAsAverageDepositWhenNoDeposits(){
            CashMachine cashMachine = new CashMachine();
            assertEquals(0.0, cashMachine.getAverageDeposit(), 0.01);
        }

        @Test
        public void ReturnZeroAsAverageWithdrawalWhenNoWithdrawals(){
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(50);
            cashMachine.addTransaction(100);
            cashMachine.addTransaction(200);
            cashMachine.addTransaction(20);
            assertEquals(0.0, cashMachine.getAverageWithdrawals(), 0.02);
        }

    }
