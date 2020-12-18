package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank(int numberOfCashMachines) {
        this.numberOfCashMachines = numberOfCashMachines;
        this.cashMachines = new CashMachine[numberOfCashMachines];

        for (int i = 0; i < cashMachines.length; i++) {
            cashMachines[i] = new CashMachine();
        }
    }

    public int getNumber() {
        return this.numberOfCashMachines;
    }

    public void addTransaction(int deviceNumber, int amount) {
        if (deviceNumber < cashMachines.length) {
            cashMachines[deviceNumber].addTransaction(amount);
        }
    }

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getTotalNumberOfDeposits() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getNumberOfDeposits();
        }
        return sum;
    }

    public int getTotalNumberOfWithdrawals() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getNumberOfWithdrawals();
        }

        return sum;

    }

    public double getTotalAvgDeposits() {
        if (this.cashMachines.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getAverageDeposit();
        }

        return sum / cashMachines.length;
    }

    public double getTotalAverageWithdrawals() {
        if (this.cashMachines.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getAverageWithdrawals();
        }

        return (sum / cashMachines.length) * -1;
    }
}
