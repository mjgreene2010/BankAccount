package com.michaelgreene;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default email","Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String
            customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of  $" + depositAmount + "made. New balance is $" + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Only $" + this.accountBalance + " available. Withdrawal not processed");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
