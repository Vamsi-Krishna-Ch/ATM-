package com.vbank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    /* Set the Customer Number */
    
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber; 
    }

    /* Get the customer Number */

    public int getCustomerNumber() {
        return customerNumber;
    }

    /* Set the pin Number */
    
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    /* Get the pin Number */

    public int getPinNumber(){
        return pinNumber;
    }

    /* Get Checking Account Balance */

    public double getCheckingBalance(){
        return checkingBalance;
    }

    /* Get Saving Account Balance */

    public double getSavingBalance(){
        return savingBalance;
    }

    /* Calaculate Checking Account Withdrawal */

    public double calcCheckingWithdra(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    /* Calculate Saving Account Withdrawal */

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    /* Calculate Checking Account deposit */

    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    /* Calculate Saving Account deposit */

    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    /* Customer Checking Account withdraw input */

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdra(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Saving Account Withdraw input */

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingBalance + "\n");
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Checking Account Deposit Input */

    public void getCheckingDepositInput() {
        System.out.println("Checkinging Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit in Checkingng Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Saving Account Deposit input */

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit in Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

}
