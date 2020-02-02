package day46;

public class AtTheBank {

    public static void main(String[] args) {

        ChequeAccount account1 = new ChequeAccount("Zehra",54321,10000);

        account1.deposit(100);
        account1.deposit(5000);
        System.out.println("account1 = " + account1);
        account1.withdraw(5100);

        System.out.println("account1 = " + account1);


    }

}
