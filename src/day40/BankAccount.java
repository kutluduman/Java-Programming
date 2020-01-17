package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;

    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber,
                               double newBalance) {

        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;

    }


    public void showAccountBalance() {

        System.out.println("current balance = " + balance);

    }

    public void showAccountHolderAccountType() {


        System.out.println("account holder is " + accountHolder+ " and account type is " + accountType);


    }

    public double getBalance() {
        // after doing a lot of validation to make sure you have correct credential to view the balance
        // then return the balance


        return balance;

    }

    public void deposit(double amount) {

        balance += amount;

    }

    public void withdraw(double amount) {

        balance -= amount;

    }

    public void withdraw100() {

        withdraw(100);


    }

    public void purchaseProduct(double productPrice, int count) {

        withdraw(productPrice * count);

    }


    public String toString() {


        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
