package day46;

public class SavingAccount extends BankAccount {


    double interestRate;


    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {

        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;


    }

    // in our savingAccount, if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we wil override the withdraw method to reflect this requirement

    @Override

    public void withdraw(int amount) {
//
//
//        this.balance -= 30;

        super.withdraw(amount);
        super.withdraw(30);

    }

    @Override

    public void deposit(int amount) {
        int actualAmount = (int) (amount + amount * interestRate);

        super.deposit(actualAmount);


    }


    public static void main(String[] args) {


        SavingAccount s1 = new SavingAccount("Said", 223344, 50000, 0.042);


        s1.withdraw(10000);

        System.out.println("s1 = " + s1);

    }


}
