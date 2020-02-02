package day46;

public class ChequeAccount extends BankAccount {

    // no additional field in cheque account


    public ChequeAccount(String accountHolder, long accountNum, double balance) {

        super(accountHolder, accountNum, balance);


    }

    // this awesome bank account will give you $20 if you deposit over 3000$

    @Override

    public void deposit(int amount) {

        if (amount >= 300) {

            super.deposit(amount + 20);


        } else {

            super.deposit(amount);
        }


    }

    @Override
    public String toString() {


        return "ChequeAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
