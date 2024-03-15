package Online_Banking_System;
import java.util.List;
import java.util.Scanner;

public class BankAccount {
    private String name;
    private int age;
    private String AccType;
    private String FatherName;
    private String pin;
    private int balance = 0;
    private String AccNumber;
    private List<BankAccount> list0fbankaccount;
    BankAccount(List<BankAccount> list0fbankaccount) {
        this.list0fbankaccount = list0fbankaccount;
    }
    public BankAccount(String name, int age, String AccType, String FatherName, int pin, int balance, long AccNumber) {
        this.name = name;
        this.age = age;
        this.AccType = AccType;
        this.FatherName = FatherName;
        this.pin = Integer.toString(pin);
        this.balance = balance;
        this.AccNumber = Long.toString(AccNumber);
    }
    public BankAccount() {
    }
    public void Balance(List<BankAccount> bankAcc, Scanner sc) {
        System.out.println("Enter your Account Number: ");
        String an = sc.nextLine();
        for (BankAccount bc : bankAcc) {
            if (bc.AccNumber.equals(an)) {
                System.out.println("Enter your 4 Digit Pin Number: ");
                String p = sc.nextLine();
                if (bc.pin.equals(p)) System.out.println("Your Account balance is Rs. " + bc.balance);
            }

        }
    }
    public void deposit(List<BankAccount> list, Scanner sc) {
        System.out.println("Enter your Account Number: ");
        String an = sc.nextLine();
        for (BankAccount bc : list) {
            if (bc.AccNumber.equals(an)) {
                System.out.println("Enter your 4 Digit Pin Number: ");
                String p = sc.nextLine();
                if (bc.pin.equals(p)) {
                    System.out.println("Enter the Amount");
                    int amount = sc.nextInt();
                    bc.balance += amount;
                    System.out.println("Deposited amount Rs." + amount);
                    System.out.println("Available Balance Rs." + bc.balance);
                }
            }
        }
    }
    public void withdraw(List<BankAccount> list, Scanner sc) {
        System.out.println("Enter your Account Number: ");
        String an = sc.nextLine();
        for (BankAccount bc : list) {
            if (bc.AccNumber.equals(an)) {
                System.out.println("Enter your 4 Digit Pin Number: ");
                String p = sc.nextLine();
                if (bc.pin.equals(p)) {
                    System.out.println("Enter the Amount");
                    int amount = sc.nextInt();
                    if(amount>bc.balance) System.out.println("Available balance Rs."+bc.balance);
                    else {
                        bc.balance-=amount;
                        System.out.println("You Have Withdraw Rs."+amount);
                        System.out.println("Available Balance Rs."+bc.balance);
                    }
                }
            }
        }
    }
}