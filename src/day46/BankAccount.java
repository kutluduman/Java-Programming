package day46;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;

    //always add no arg constructor in super class
    // to avoid error in sub class because of super()

    public BankAccount() {


    }

    public BankAccount(String accountHolder, long accountNum, double balance) {

//        super(); you have this in the constructor by default, you just don't see it
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;

    }

    public void deposit(int amount) {

        this.balance += amount;

    }

    public void withdraw(int amount) {

        this.balance -= amount;

    }

    @Override // its optional, once being used, it will enforce overriding rule
    // if any rule does not match it will not even compile
    // so it's always god to use it to prevent accidental errors


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
