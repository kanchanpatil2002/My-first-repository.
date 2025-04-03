package codesoft;
import java.util.Scanner;

//Class to represent the user's bank account
class BankAccount {
 private double balance;

 // Constructor to initialize balance
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Deposit method
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("₹" + amount + " deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Withdraw method
 public void withdraw(double amount) 
 {
     if (amount > 0 && amount <= balance) 
     {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn successfully.");
     }
     else if (amount > balance)
     {
         System.out.println("Insufficient balance.");
     }
     else
     {
         System.out.println("Invalid withdrawal amount.");
     }
 }

 // Method to check balance
 public void checkBalance()
 {
     System.out.println("Current balance: ₹" + balance);
 }
}

//Class representing the ATM machine
class ATM
{
 private BankAccount userAccount;
 private Scanner scanner;

 // Constructor to initialize ATM with a user bank account
 public ATM(BankAccount account)
 {
     this.userAccount = account;
     this.scanner = new Scanner(System.in);
 }

 // Method to display the ATM interface
 public void start() 
 {
     while (true) 
     {
         System.out.println("\n===== ATM Menu =====");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");

         int choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 System.out.print("Enter amount to deposit: ");
                 double depositAmount = scanner.nextDouble();
                 userAccount.deposit(depositAmount);
                 break;
             case 2:
                 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = scanner.nextDouble();
                 userAccount.withdraw(withdrawAmount);
                 break;
             case 3:
                 userAccount.checkBalance();
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM. Goodbye!");
                 return;
             default:
                 System.out.println("Invalid option. Please try again.");
         }
     }
 }
}

//Main class to run the program
public class Task3 {
 public static void main(String[] args) {
     BankAccount userAccount = new BankAccount(5000); // Initial balance ₹5000
     ATM atm = new ATM(userAccount);
     atm.start(); // Start the ATM interface
 }
}