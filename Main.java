package Online_Banking_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        List<BankAccount> list = new ArrayList<>();
        while(true){
            System.out.println("---------------Wecome To My Online Bank-----------\nCreate New account Press - 1\nExisting User Press - 2");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            sc.nextLine();
//        New Account Creation Step
            if(option==1){
                System.out.print("Enter Your name: "); String Name = sc.nextLine();
                System.out.print("Enter Your Age: "); int Age = sc.nextInt(); sc.nextLine();
                System.out.print("Enter Your Account Type: "); String AccType = sc.nextLine();
                System.out.print("Enter Your Father's name: "); String FathersName = sc.nextLine();
                System.out.print("Set Your 4 Digit Pin Number: "); int pin = sc.nextInt(); sc.nextLine();
                System.out.print("Enter Your Deposit Amount Minimum Rs.500: "); int balance = sc.nextInt();
                long AccNumber = (long) (Math.random()*Math.pow(10,10));
                BankAccount newUser = new BankAccount(Name,Age,AccType,FathersName,pin,balance,AccNumber);
                list.add(newUser);
                System.out.println("############  SuccessFully Created your New Bank Account ------------");
                System.out.println("Account Holder Name :"+Name+"\nYour Account Number is: "+AccNumber);
            }
            else if(option==2){
                System.out.println("1- Check Balance\n2- Deposit amount\n3- Withdraw");
                int banking = sc.nextInt();
                sc.nextLine();
                if (banking==1){
                        bank.Balance(list , sc);
                } else if (banking==2) {
                    bank.deposit(list , sc);
                }
                else if (banking==3) {
                    bank.withdraw(list , sc);
                }
                else System.out.println("Enter Valid Option");
            }
            else System.out.println("Enter valid Option...");
        }
    }
}
