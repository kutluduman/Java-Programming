package day52;

public class BankTest {

    public static void main(String[] args) {

        Account a1 = new Account("Jon Snow",10000);
        Account a2 = new Account("Arya Start", 7000);

        System.out.println("a1 before transfer = " + a1);
        System.out.println("a2 before transfer = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after transfer = " + a1);
        System.out.println("a2 after transfer = " + a2);

        a2.transferAll(a1);
        System.out.println("a1 after new transfer = " + a1);
        System.out.println("a2 after new transfer = " + a2);


        System.out.println(a1.isPalindrome());
        System.out.println(a2.isPalindrome());



    }
}
