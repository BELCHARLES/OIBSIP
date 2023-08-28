import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return type + ": $" + amount;
    }
}

class Account {
    private int pin;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public Account() {
        this.pin = -1;
        this.balance = 100.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void setPin(int pin) {
        this.pin = pin;
        System.out.println("PIN set successfully.");
    }

    public boolean checkPin(int pin) {
        return this.pin == pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
        System.out.println("$" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= 100) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Must maintain a minimum balance of $100.0");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        boolean loggedIn = false;

        System.out.println("Welcome to the ATM!");

        // PIN setup
        System.out.print("Set your PIN: ");
        int pin = scanner.nextInt();
        account.setPin(pin);

        boolean exit = false;
        while (!exit) {
            while (!loggedIn) {
                System.out.print("Enter your PIN to log in: ");
                int enteredPin = scanner.nextInt();
                if (account.checkPin(enteredPin)) {
                    loggedIn = true;
                    System.out.println("Logged in successfully.");
                } else {
                    System.out.println("Incorrect PIN. Please try again.");
                }
            }

            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Reset PIN");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    System.out.print("Enter current PIN: ");
                    int currentPin = scanner.nextInt();
                    if (account.checkPin(currentPin)) {
                        System.out.print("Enter new PIN: ");
                        int newPin = scanner.nextInt();
                        account.setPin(newPin);
                        System.out.println("PIN reset successfully.");
                    } else {
                        System.out.println("Incorrect current PIN. PIN reset failed.");
                    }
                    break;
                case 6:
                    loggedIn = false;
                    System.out.println("Logged out.");
                    break;
                case 7:
                    exit = true;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
