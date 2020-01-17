package day40;

public class BankAccountActivity {


    public static void main(String[] args) {


        BankAccount b1 = new BankAccount();

        b1.setAllTheValue("Saving", "Kutluhan", 5515, 1000);

        b1.showAccountHolderAccountType();

        b1.deposit(3000);

        b1.withdraw100();

        System.out.println(b1);

        b1.withdraw(400);

        b1.showAccountBalance();


    }


}
