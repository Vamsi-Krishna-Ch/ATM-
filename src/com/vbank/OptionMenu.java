package com.vbank;

import java.io.IOException;
import java.security.KeyStore;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Map<Integer, Integer> data = new HashMap<Integer, Integer>();

    /* validate Login Info Customer Number and pin */

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(111, 333);
                data.put(898, 890);
                data.put(444,555);

                System.out.println("Welcome to JAVA ATM");
                 
                System.out.println("Enter your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your pin Number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n"+"Invalid Character(s). only numbers."+"\n");
                x = 2;
            }
            for (HashMap.Entry<Integer, Integer> entry : data.entrySet()) {
                if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("\n"+"Wrong Customer Number or Pin Number." +"\n");
        } while(x == 1);
        
    }



// Display Account Type Menu with Selection

public void getAccountType(){
    System.out.println("Select the Account you want to access: ");
    System.out.println("Type 1 - Checking Account");
    System.out.println("Type 2 - Saving account");
    System.out.println("Type 3 - Exit");
    System.out.println("Choice:");

    selection = menuInput.nextInt();

    switch(selection) {
        case 1:
            getChecking();
            break;

        case 2:
            getSaving();
            break;

        case 3:
            System.out.println("Thank you for using this ATM, bye.");
            break;

        default:
            System.out.println("\n" + "Invalid Choice." + "\n");
            getAccountType();
    }
}

// Display Checking Account Menu with Selection

public void getChecking() {
    System.out.println("Checking Account: ");
    System.out.println("Type 1 - View Balance");
    System.out.println("Type 2 - Withdraw Funds");
    System.out.println("Type 3 - Deposit Funds");
    System.out.println("Type 4 - Exit");
    System.out.println("Choice: ");

    selection = menuInput.nextInt();

    switch(selection) {
        case 1:
            System.out.print("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
            getAccountType();
            break;

        case 2:
            getCheckingWithdrawInput();
            getAccountType();
            break;

        case 3:
            getCheckingDepositInput();
            getAccountType();
            break;

        case 4:
            System.out.println("Thanks for Using JAVA ATM, Bye.");
            break;

        default:
            System.out.println("\n" + "Invalid Choice." + "\n");
            getChecking();
    }
}

// Display Saving Account Menu with Selection

public void getSaving() {
    System.out.print("Saving Account: ");
    System.out.print("Type 1 - View Balance");
    System.out.print("Type 2 - Withdraw Funds");
    System.out.print("Type 3 - Deposit Funds");
    System.out.print("Type 4 - Exit");
    System.out.print("Choice: ");

    selection = menuInput.nextInt();

    switch(selection) {
        case 1:
            System.out.print("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
            getAccountType();
            break;

        case 2:
            getSavingWithdrawInput();
            getAccountType();
            break;

        case 3:
            getSavingDepositInput();
            getAccountType();
            break;

        case 4:
            System.out.println("Thanks for Using JAVA ATM, Bye.");
            break;

        default:
            System.out.println("\n" + "Invalid Choice." + "\n");
            getSaving();
    }
}
int selection;
}

