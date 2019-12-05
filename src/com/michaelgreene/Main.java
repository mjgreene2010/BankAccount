package com.michaelgreene;

public class Main {

    public static void main(String[] args) {

        BankAccount mikeAccount = new BankAccount();
//        ("12345", 0.00, "Mike Brown",
//                "mgreen@gmail.com", "870-818-2351");


        System.out.println(mikeAccount.getAccountNumber());
        mikeAccount.deposit(50);
        mikeAccount.withdrawal(100.0);

        mikeAccount.deposit(51);
        mikeAccount.withdrawal(100.0);


        BankAccount rodAccount = new BankAccount("Rod", "rod@gmail.com", "12345");
        System.out.println(rodAccount.getAccountNumber() + " name " + rodAccount.getCustomerName());
    }
}
